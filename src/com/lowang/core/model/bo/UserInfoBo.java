package com.lowang.core.model.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息.
 * @author Lo&Wang
 */
public class UserInfoBo implements Serializable {
    /**
     * 字段属性.
     */
    private static final long serialVersionUID = -3256902561549060379L;
    private Long keyid;// 主键
    private String username;// 用户名
    private String password;// 密码
    private Byte sex;// 性别
    private Byte age;// 年龄
    private String qq;// qq号码
    private Date regtime;// 注册时间
    private Date modifytime;// 修改时间
    private Byte isdisable;// 是否禁用,0:启用/1:禁用
    private Byte isdelete;// 是否删除,0:未删除/1:已删除
    /**
     * 学生信息.
     */
    private StudentInfoBo studentInfoBo; // 学生信息
    public Long getKeyid() {
        return keyid;
    }
    public void setKeyid(Long keyid) {
        this.keyid = keyid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Byte getSex() {
        return sex;
    }
    public void setSex(Byte sex) {
        this.sex = sex;
    }
    public Byte getAge() {
        return age;
    }
    public void setAge(Byte age) {
        this.age = age;
    }
    public String getQq() {
        return qq;
    }
    public void setQq(String qq) {
        this.qq = qq;
    }
    public Date getRegtime() {
        return regtime;
    }
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }
    public Date getModifytime() {
        return modifytime;
    }
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
    public Byte getIsdisable() {
        return isdisable;
    }
    public void setIsdisable(Byte isdisable) {
        this.isdisable = isdisable;
    }
    public Byte getIsdelete() {
        return isdelete;
    }
    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }
    /**
     * 设置 学生信息.
     * @return studentInfoBo 学生信息.
     */
    public StudentInfoBo getStudentInfoBo() {
        return studentInfoBo;
    }
    /**
     * 获取 学生信息.
     * @param studentInfoBo 学生信息.
     */
    public void setStudentInfoBo(StudentInfoBo studentInfoBo) {
        this.studentInfoBo = studentInfoBo;
    }
}
