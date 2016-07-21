package com.lowang.user.service;

import com.lowang.core.model.bo.UserInfoBo;

/**
 * 用户服务接口.
 * @author Lo&Wang
 */
public interface IUserInfoService {
    /**
     * 用户注册.
     * @param userinfo 用户信息
     */
    public void reg(UserInfoBo userinfo) throws Exception;
    /**
     * 用户登录.
     * @param username 用户名
     * @param password 密码
     */
    public UserInfoBo login(String username, String password) throws Exception;
}
