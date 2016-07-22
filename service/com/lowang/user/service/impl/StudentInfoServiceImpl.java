package com.lowang.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.lowang.core.exception.AppException;
import com.lowang.core.exception.BizException;
import com.lowang.core.model.bo.StudentInfoBo;
import com.lowang.core.util.BeanUtils;
import com.lowang.user.service.IStudentInfoService;

/**
 * 新建类.
 * @author Lo&Wang
 */
@Service("studentInfoService")
public class StudentInfoServiceImpl implements IStudentInfoService {
    private static final RowMapper<StudentInfoBo> stuMapper = new BeanPropertyRowMapper<>(StudentInfoBo.class);
    @Resource
    private JdbcTemplate dao;
    @Override
    public void addStudentInfo(StudentInfoBo s) throws Exception {
        if (s.getUserid() == null) {
            throw new BizException("用户不存在");
        }
        StudentInfoBo stu = getStudentInfoByUserID(s.getUserid());
        if (stu != null) {
            throw new AppException("该用户已经登记过学生信息了");
        }
        BeanUtils.notNull(s);
        String sql = "insert into studentinfo (userid,studentid, studentname, sex, "
                + "birthday, phoneno, wechat, email, provinceid, provincename, cityid, cityname, districtid, districtname,"
                + "address, photopath, adviserid, advisername, campusid, campusname, schoolid, schoolname, haveclass,"
                + "existingclass, historyclass, teacher, chooseclass, attendance, remarks, firstsubject1, firstsubject2,"
                + "firstsubject3, secondsubject1, secondsubject2, secondsubject3, thirdsubject1, thirdsubject2, thirdsubject3,"
                + "addtime, isdelete ) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Object[] args = new Object[]{s.getUserid(), s.getStudentid(), s.getStudentname(), s.getSex(), s.getBirthday(), s.getPhoneno(), s.getWechat(), s.getEmail(), s.getProvinceid(),
                s.getProvincename(), s.getCityid(), s.getCityname(), s.getDistrictid(), s.getDistrictname(), s.getAddress(), s.getPhotopath(), s.getAdviserid(), s.getAdvisername(),
                s.getCampusid(), s.getCampusname(), s.getSchoolid(), s.getSchoolname(), s.getHaveclass(), s.getExistingclass(), s.getHistoryclass(), s.getTeacher(), s.getChooseclass(),
                s.getAttendance(), s.getRemarks(), s.getFirstsubject1(), s.getFirstsubject2(), s.getFirstsubject3(), s.getSecondsubject1(), s.getSecondsubject2(), s.getSecondsubject3(),
                s.getThirdsubject1(), s.getThirdsubject2(), s.getThirdsubject3(), s.getAddtime(), s.getIsdelete()};
        int affectRow = dao.update(sql, args);
        if (affectRow != 1) {
            throw new AppException("登记学生信息失败");
        }
    }
    @Override
    public StudentInfoBo getStudentInfoByUserID(long userID) throws Exception {
        String sql = "select * from studentinfo where userid=?";
        List<StudentInfoBo> list = dao.query(sql, new Object[]{userID}, stuMapper);
        if (list != null && list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }
}
