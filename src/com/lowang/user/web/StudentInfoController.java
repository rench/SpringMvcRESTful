package com.lowang.user.web;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lowang.core.Const;
import com.lowang.core.exception.BizException;
import com.lowang.core.model.Response;
import com.lowang.core.model.Response.ERROR;
import com.lowang.core.model.bo.StudentInfoBo;
import com.lowang.core.model.bo.UserInfoBo;
import com.lowang.user.service.IStudentInfoService;

/**
 * 学生信息.
 * @author Lo&Wang
 */
@Controller("studentController")
@RequestMapping("/api/student")
public class StudentInfoController {
    private static final Logger LOG = Logger.getLogger(LoginController.class);
    @Resource
    private IStudentInfoService studentInfoService;
    /**
     * 学生信息登记.
     * @param studentInfoBo
     * @return .
     */
    @RequestMapping(value = {""}, method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String add(StudentInfoBo studentInfoBo, HttpServletRequest req) {
        Response<StudentInfoBo> res;
        if (LOG.isInfoEnabled()) {
            LOG.info("登记学生信息");
        }
        UserInfoBo user = (UserInfoBo) req.getSession().getAttribute(Const.SESSION_USER);
        if (user == null) {
            // return new Response<StudentInfoBo>(ERROR.AUTH_ERROR, "登录已超时,请重新登录").toJSONString();
        }
        studentInfoBo.setUserid(1l);
        // 2.新增
        try {
            studentInfoBo.setAddtime(new Date());
            studentInfoService.addStudentInfo(studentInfoBo);
            res = new Response<>(studentInfoBo);
        } catch (BizException e) {
            e.printStackTrace();
            res = new Response<>(ERROR.PARAM_ERROR, e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            res = new Response<>(ERROR.SYS_ERROR, e.getMessage());
        }
        return res.toJSONString();
    }
    /**
     * 学生信息登记.
     * @param studentInfoBo
     * @return .
     */
    @RequestMapping(value = {"/:userid"}, method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String get(@PathVariable String userid) {
        if (LOG.isInfoEnabled()) {
            LOG.info("查询学生信息");
        }
        return "";
    }
}
