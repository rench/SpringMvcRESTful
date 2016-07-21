package com.lowang.core.model.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 注册.
 * @author Lo&Wang
 */
public class UserRegResponse implements Serializable {
    /**
     * 字段属性.
     */
    private static final long serialVersionUID = -2730719961183953577L;
    /**
     * 用户名.
     */
    private String username;
    /**
     * qq.
     */
    private String qq;
    /**
     * 注册时间.
     */
    private Date regtime;
    /**
     * 设置 用户名.
     * @return username 用户名.
     */
    public String getUsername() {
        return username;
    }
    /**
     * 获取 用户名.
     * @param username 用户名.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * 设置 qq.
     * @return qq qq.
     */
    public String getQq() {
        return qq;
    }
    /**
     * 获取 qq.
     * @param qq qq.
     */
    public void setQq(String qq) {
        this.qq = qq;
    }
    /**
     * 设置 注册时间.
     * @return regtime 注册时间.
     */
    public Date getRegtime() {
        return regtime;
    }
    /**
     * 获取 注册时间.
     * @param regtime 注册时间.
     */
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }
}
