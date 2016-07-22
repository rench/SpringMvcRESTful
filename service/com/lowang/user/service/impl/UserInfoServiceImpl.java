package com.lowang.user.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.lowang.core.exception.AppException;
import com.lowang.core.exception.BizException;
import com.lowang.core.model.bo.UserInfoBo;
import com.lowang.core.util.BeanUtils;
import com.lowang.user.service.IUserInfoService;

/**
 * 用户服务接口实现.
 * @author Lo&Wang
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public void reg(final UserInfoBo userinfo) throws Exception {
        String username = userinfo.getUsername();
        validateUserName(username);
        BeanUtils.notNull(userinfo);
        userinfo.setRegtime(new Date()); // 注册时间
        KeyHolder keyHoder = new GeneratedKeyHolder();
        int affectRow = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement("insert into userinfo(username,password,sex,age,qq,regtime,isdisable,isdelete) values(?,?,?,?,?,?,?,?)",
                        Statement.RETURN_GENERATED_KEYS);
                int i = 1;
                ps.setString(i++, userinfo.getUsername());
                ps.setString(i++, userinfo.getPassword());
                ps.setInt(i++, userinfo.getSex());
                ps.setInt(i++, userinfo.getAge());
                ps.setString(i++, userinfo.getQq());
                java.sql.Date d = new java.sql.Date(userinfo.getRegtime().getTime());
                ps.setDate(i++, d);
                ps.setInt(i++, userinfo.getIsdisable());
                ps.setInt(i++, userinfo.getIsdelete());
                return ps;
            }
        }, keyHoder);
        if (affectRow > 0) {
            userinfo.setKeyid(keyHoder.getKey().longValue());
        } else {
            throw new AppException("用户注册失败");
        }
    }
    /**
     * 验证用户名重复.
     * @param username
     * @throws DataAccessException
     * @throws BizException
     */
    private void validateUserName(String username) throws DataAccessException, BizException {
        int userCount = jdbcTemplate.queryForInt("select count(1) from userinfo where username=?", username);
        if (userCount > 0) {
            throw new BizException("该用户已经注册");
        }
    }
    @Override
    public UserInfoBo login(String username, String password) throws Exception {
        List<UserInfoBo> list = jdbcTemplate.query("select * from userinfo where username=?", new Object[]{username}, new BeanPropertyRowMapper<UserInfoBo>(UserInfoBo.class));
        if (list == null || list.isEmpty()) {
            throw new AppException("用户不存在");
        }
        for (UserInfoBo user : list) {
            if (username.equalsIgnoreCase(user.getUsername()) && password.equalsIgnoreCase(user.getPassword())) {
                return user;
            }
        }
        throw new AppException("用户名或者密码错误");
    }
}
