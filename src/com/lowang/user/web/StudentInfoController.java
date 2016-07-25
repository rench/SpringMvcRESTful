package com.lowang.user.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
    private AtomicLong atcl = new AtomicLong(100);
/*    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   // true:允许输入空值，false:不能为空值
    }*/
    private static final Logger LOG = Logger.getLogger(StudentInfoController.class);
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
        studentInfoBo.setUserid(atcl.getAndIncrement());
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
