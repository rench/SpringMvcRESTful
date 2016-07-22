package com.lowang.user.service;

import com.lowang.core.model.bo.StudentInfoBo;

/**
 * 学生信息服务接口.
 * @author Lo&Wang
 */
public interface IStudentInfoService {
    /**
     * 学生信息录入.
     * @param userinfo 学生信息
     */
    public void addStudentInfo(StudentInfoBo studentInfo) throws Exception;
    /**
     * 获取学生信息.
     * @param userID 获取学生信息
     */
    public StudentInfoBo getStudentInfoByUserID(long userID) throws Exception;
}
