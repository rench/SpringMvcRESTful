package com.lowang.core.model.bo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 学生信息登记表.
 * @author Lo&Wang
 */
public class StudentInfoBo implements Serializable {
    /**
     * 序列化.
     */
    private static final long serialVersionUID = 1L;
    /**
     * @主键
     */
    private Long keyid;
    /**
     * @用户id
     */
    private Long userid;
    /**
     * @学生ID
     */
    private String studentid;
    /**
     * @学生姓名
     */
    private String studentname;
    /**
     * @性别
     */
    private Integer sex;
    /**
     * @出生日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    /**
     * @手机号码
     */
    private String phoneno;
    /**
     * @微信号
     */
    private String wechat;
    /**
     * @邮箱
     */
    private String email;
    /**
     * @省ID
     */
    private String provinceid;
    /**
     * @省名称
     */
    private String provincename;
    /**
     * @城市ID
     */
    private String cityid;
    /**
     * @城市名称
     */
    private String cityname;
    /**
     * @区县ID
     */
    private String districtid;
    /**
     * @区县名称
     */
    private String districtname;
    /**
     * @详细地址
     */
    private String address;
    /**
     * @照片路劲
     */
    private String photopath;
    /**
     * @顾问ID
     */
    private String adviserid;
    /**
     * @顾问Name
     */
    private String advisername;
    /**
     * @校区ID
     */
    private String campusid;
    /**
     * @校区名称
     */
    private String campusname;
    /**
     * @学校ID
     */
    private String schoolid;
    /**
     * @学校名称
     */
    private String schoolname;
    /**
     * @是否上课
     */
    private Integer haveclass;
    /**
     * @现课程
     */
    private String existingclass;
    /**
     * @历史课程
     */
    private String historyclass;
    /**
     * @代课老师
     */
    private String teacher;
    /**
     * @选报课程
     */
    private String chooseclass;
    /**
     * @出勤率
     */
    private Double attendance;
    /**
     * @课堂表现
     */
    private String remarks;
    /**
     * @第一次模考科目一
     */
    private Double firstsubject1;
    /**
     * @第一次模考科目二
     */
    private Double firstsubject2;
    /**
     * @第一次模考科目三
     */
    private Double firstsubject3;
    /**
     * @第二次模考科目一
     */
    private Double secondsubject1;
    /**
     * @第二次模考科目二
     */
    private Double secondsubject2;
    /**
     * @第二次模考科目三
     */
    private Double secondsubject3;
    /**
     * @第三次模考科目一
     */
    private Double thirdsubject1;
    /**
     * @第三次模考科目二
     */
    private Double thirdsubject2;
    /**
     * @第三次模考科目三
     */
    private Double thirdsubject3;
    /**
     * @添加时间
     */
    private Date addtime;
    /**
     * @更新时间
     */
    private Date modifytime;
    /**
     * @删除标识
     */
    private Integer isdelete;
    /**
     * 设置 @主键
     * @return keyid @主键
     */
    public Long getKeyid() {
        return keyid;
    }
    /**
     * 获取 @主键
     * @param keyid @主键
     */
    public void setKeyid(Long keyid) {
        this.keyid = keyid;
    }
    /**
     * 设置 @用户id
     * @return userid @用户id
     */
    public Long getUserid() {
        return userid;
    }
    /**
     * 获取 @用户id
     * @param userid @用户id
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }
    /**
     * 设置 @学生ID
     * @return studentid @学生ID
     */
    public String getStudentid() {
        return studentid;
    }
    /**
     * 获取 @学生ID
     * @param studentid @学生ID
     */
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
    /**
     * 设置 @学生姓名
     * @return studentname @学生姓名
     */
    public String getStudentname() {
        return studentname;
    }
    /**
     * 获取 @学生姓名
     * @param studentname @学生姓名
     */
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    /**
     * 设置 @性别
     * @return sex @性别
     */
    public Integer getSex() {
        return sex;
    }
    /**
     * 获取 @性别
     * @param sex @性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    /**
     * 设置 @出生日期
     * @return birthday @出生日期
     */
    public Date getBirthday() {
        return birthday;
    }
    /**
     * 获取 @出生日期
     * @param birthday @出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    /**
     * 设置 @手机号码
     * @return phoneno @手机号码
     */
    public String getPhoneno() {
        return phoneno;
    }
    /**
     * 获取 @手机号码
     * @param phoneno @手机号码
     */
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    /**
     * 设置 @微信号
     * @return wechat @微信号
     */
    public String getWechat() {
        return wechat;
    }
    /**
     * 获取 @微信号
     * @param wechat @微信号
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }
    /**
     * 设置 @邮箱
     * @return email @邮箱
     */
    public String getEmail() {
        return email;
    }
    /**
     * 获取 @邮箱
     * @param email @邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 设置 @省ID
     * @return provinceid @省ID
     */
    public String getProvinceid() {
        return provinceid;
    }
    /**
     * 获取 @省ID
     * @param provinceid @省ID
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }
    /**
     * 设置 @省名称
     * @return provincename @省名称
     */
    public String getProvincename() {
        return provincename;
    }
    /**
     * 获取 @省名称
     * @param provincename @省名称
     */
    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }
    /**
     * 设置 @城市ID
     * @return cityid @城市ID
     */
    public String getCityid() {
        return cityid;
    }
    /**
     * 获取 @城市ID
     * @param cityid @城市ID
     */
    public void setCityid(String cityid) {
        this.cityid = cityid;
    }
    /**
     * 设置 @城市名称
     * @return cityname @城市名称
     */
    public String getCityname() {
        return cityname;
    }
    /**
     * 获取 @城市名称
     * @param cityname @城市名称
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
    /**
     * 设置 @区县ID
     * @return districtid @区县ID
     */
    public String getDistrictid() {
        return districtid;
    }
    /**
     * 获取 @区县ID
     * @param districtid @区县ID
     */
    public void setDistrictid(String districtid) {
        this.districtid = districtid;
    }
    /**
     * 设置 @区县名称
     * @return districtname @区县名称
     */
    public String getDistrictname() {
        return districtname;
    }
    /**
     * 获取 @区县名称
     * @param districtname @区县名称
     */
    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }
    /**
     * 设置 @详细地址
     * @return address @详细地址
     */
    public String getAddress() {
        return address;
    }
    /**
     * 获取 @详细地址
     * @param address @详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * 设置 @照片路劲
     * @return photopath @照片路劲
     */
    public String getPhotopath() {
        return photopath;
    }
    /**
     * 获取 @照片路劲
     * @param photopath @照片路劲
     */
    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }
    /**
     * 设置 @顾问ID
     * @return adviserid @顾问ID
     */
    public String getAdviserid() {
        return adviserid;
    }
    /**
     * 获取 @顾问ID
     * @param adviserid @顾问ID
     */
    public void setAdviserid(String adviserid) {
        this.adviserid = adviserid;
    }
    /**
     * 设置 @顾问Name
     * @return advisername @顾问Name
     */
    public String getAdvisername() {
        return advisername;
    }
    /**
     * 获取 @顾问Name
     * @param advisername @顾问Name
     */
    public void setAdvisername(String advisername) {
        this.advisername = advisername;
    }
    /**
     * 设置 @校区ID
     * @return campusid @校区ID
     */
    public String getCampusid() {
        return campusid;
    }
    /**
     * 获取 @校区ID
     * @param campusid @校区ID
     */
    public void setCampusid(String campusid) {
        this.campusid = campusid;
    }
    /**
     * 设置 @校区名称
     * @return campusname @校区名称
     */
    public String getCampusname() {
        return campusname;
    }
    /**
     * 获取 @校区名称
     * @param campusname @校区名称
     */
    public void setCampusname(String campusname) {
        this.campusname = campusname;
    }
    /**
     * 设置 @学校ID
     * @return schoolid @学校ID
     */
    public String getSchoolid() {
        return schoolid;
    }
    /**
     * 获取 @学校ID
     * @param schoolid @学校ID
     */
    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid;
    }
    /**
     * 设置 @学校名称
     * @return schoolname @学校名称
     */
    public String getSchoolname() {
        return schoolname;
    }
    /**
     * 获取 @学校名称
     * @param schoolname @学校名称
     */
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
    /**
     * 设置 @是否上课
     * @return haveclass @是否上课
     */
    public Integer getHaveclass() {
        return haveclass;
    }
    /**
     * 获取 @是否上课
     * @param haveclass @是否上课
     */
    public void setHaveclass(Integer haveclass) {
        this.haveclass = haveclass;
    }
    /**
     * 设置 @现课程
     * @return existingclass @现课程
     */
    public String getExistingclass() {
        return existingclass;
    }
    /**
     * 获取 @现课程
     * @param existingclass @现课程
     */
    public void setExistingclass(String existingclass) {
        this.existingclass = existingclass;
    }
    /**
     * 设置 @历史课程
     * @return historyclass @历史课程
     */
    public String getHistoryclass() {
        return historyclass;
    }
    /**
     * 获取 @历史课程
     * @param historyclass @历史课程
     */
    public void setHistoryclass(String historyclass) {
        this.historyclass = historyclass;
    }
    /**
     * 设置 @代课老师
     * @return teacher @代课老师
     */
    public String getTeacher() {
        return teacher;
    }
    /**
     * 获取 @代课老师
     * @param teacher @代课老师
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    /**
     * 设置 @选报课程
     * @return chooseclass @选报课程
     */
    public String getChooseclass() {
        return chooseclass;
    }
    /**
     * 获取 @选报课程
     * @param chooseclass @选报课程
     */
    public void setChooseclass(String chooseclass) {
        this.chooseclass = chooseclass;
    }
    /**
     * 设置 @出勤率
     * @return attendance @出勤率
     */
    public Double getAttendance() {
        return attendance;
    }
    /**
     * 获取 @出勤率
     * @param attendance @出勤率
     */
    public void setAttendance(Double attendance) {
        this.attendance = attendance;
    }
    /**
     * 设置 @课堂表现
     * @return remarks @课堂表现
     */
    public String getRemarks() {
        return remarks;
    }
    /**
     * 获取 @课堂表现
     * @param remarks @课堂表现
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    /**
     * 设置 @第一次模考科目一
     * @return firstsubject1 @第一次模考科目一
     */
    public Double getFirstsubject1() {
        return firstsubject1;
    }
    /**
     * 获取 @第一次模考科目一
     * @param firstsubject1 @第一次模考科目一
     */
    public void setFirstsubject1(Double firstsubject1) {
        this.firstsubject1 = firstsubject1;
    }
    /**
     * 设置 @第一次模考科目二
     * @return firstsubject2 @第一次模考科目二
     */
    public Double getFirstsubject2() {
        return firstsubject2;
    }
    /**
     * 获取 @第一次模考科目二
     * @param firstsubject2 @第一次模考科目二
     */
    public void setFirstsubject2(Double firstsubject2) {
        this.firstsubject2 = firstsubject2;
    }
    /**
     * 设置 @第一次模考科目三
     * @return firstsubject3 @第一次模考科目三
     */
    public Double getFirstsubject3() {
        return firstsubject3;
    }
    /**
     * 获取 @第一次模考科目三
     * @param firstsubject3 @第一次模考科目三
     */
    public void setFirstsubject3(Double firstsubject3) {
        this.firstsubject3 = firstsubject3;
    }
    /**
     * 设置 @第二次模考科目一
     * @return secondsubject1 @第二次模考科目一
     */
    public Double getSecondsubject1() {
        return secondsubject1;
    }
    /**
     * 获取 @第二次模考科目一
     * @param secondsubject1 @第二次模考科目一
     */
    public void setSecondsubject1(Double secondsubject1) {
        this.secondsubject1 = secondsubject1;
    }
    /**
     * 设置 @第二次模考科目二
     * @return secondsubject2 @第二次模考科目二
     */
    public Double getSecondsubject2() {
        return secondsubject2;
    }
    /**
     * 获取 @第二次模考科目二
     * @param secondsubject2 @第二次模考科目二
     */
    public void setSecondsubject2(Double secondsubject2) {
        this.secondsubject2 = secondsubject2;
    }
    /**
     * 设置 @第二次模考科目三
     * @return secondsubject3 @第二次模考科目三
     */
    public Double getSecondsubject3() {
        return secondsubject3;
    }
    /**
     * 获取 @第二次模考科目三
     * @param secondsubject3 @第二次模考科目三
     */
    public void setSecondsubject3(Double secondsubject3) {
        this.secondsubject3 = secondsubject3;
    }
    /**
     * 设置 @第三次模考科目一
     * @return thirdsubject1 @第三次模考科目一
     */
    public Double getThirdsubject1() {
        return thirdsubject1;
    }
    /**
     * 获取 @第三次模考科目一
     * @param thirdsubject1 @第三次模考科目一
     */
    public void setThirdsubject1(Double thirdsubject1) {
        this.thirdsubject1 = thirdsubject1;
    }
    /**
     * 设置 @第三次模考科目二
     * @return thirdsubject2 @第三次模考科目二
     */
    public Double getThirdsubject2() {
        return thirdsubject2;
    }
    /**
     * 获取 @第三次模考科目二
     * @param thirdsubject2 @第三次模考科目二
     */
    public void setThirdsubject2(Double thirdsubject2) {
        this.thirdsubject2 = thirdsubject2;
    }
    /**
     * 设置 @第三次模考科目三
     * @return thirdsubject3 @第三次模考科目三
     */
    public Double getThirdsubject3() {
        return thirdsubject3;
    }
    /**
     * 获取 @第三次模考科目三
     * @param thirdsubject3 @第三次模考科目三
     */
    public void setThirdsubject3(Double thirdsubject3) {
        this.thirdsubject3 = thirdsubject3;
    }
    /**
     * 设置 @添加时间
     * @return addtime @添加时间
     */
    public Date getAddtime() {
        return addtime;
    }
    /**
     * 获取 @添加时间
     * @param addtime @添加时间
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
    /**
     * 设置 @更新时间
     * @return modifytime @更新时间
     */
    public Date getModifytime() {
        return modifytime;
    }
    /**
     * 获取 @更新时间
     * @param modifytime @更新时间
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
    /**
     * 设置 @删除标识
     * @return isdelete @删除标识
     */
    public Integer getIsdelete() {
        return isdelete;
    }
    /**
     * 获取 @删除标识
     * @param isdelete @删除标识
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}
