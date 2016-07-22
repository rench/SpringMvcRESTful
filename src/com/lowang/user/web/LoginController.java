package com.lowang.user.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lowang.core.Const;
import com.lowang.core.exception.AppException;
import com.lowang.core.exception.BizException;
import com.lowang.core.model.Response;
import com.lowang.core.model.Response.ERROR;
import com.lowang.core.model.bo.UserInfoBo;
import com.lowang.user.service.IUserInfoService;

/**
 * 登录类.
 * @author Lo&Wang
 */
@Controller("loginController")
@RequestMapping("/api")
public class LoginController {
    private static final Logger LOG = Logger.getLogger(LoginController.class);
    @Resource
    private IUserInfoService userInfoService;
    /**
     * 登录页面.
     */
    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    @ResponseBody
    public String loginA() {
        return "use post method";
    }
    /**
     * 登录页面.
     */
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String login(String username, String password, HttpServletRequest req) {
        Response<String> res;
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            // 用户名或者密码错误
            res = new Response<>(ERROR.PARAM_ERROR, "用户名或者密码为空");
            return res.toJSONString();
        }
        try {
            UserInfoBo user = userInfoService.login(username, password);
            req.getSession(true).setAttribute(Const.SESSION_USER, user);
            res = new Response<>("OK");
            LOG.info("用户登录成功:" + res.toJSONString());
        } catch (BizException e) {
            e.printStackTrace();
            res = new Response<>(ERROR.PARAM_ERROR, e.getMessage());
        } catch (AppException e) {
            e.printStackTrace();
            res = new Response<>(ERROR.PARAM_ERROR, e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            res = new Response<>(ERROR.SYS_ERROR, e.getMessage());
        }
        return res.toJSONString();
    }
}
