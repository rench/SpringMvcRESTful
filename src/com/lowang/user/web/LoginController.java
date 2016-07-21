package com.lowang.user.web;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lowang.core.model.Response;
import com.lowang.core.model.Response.ERROR;
import com.lowang.user.service.IUserInfoService;

/**
 * 登录类.
 * @author Lo&Wang
 */
@Controller("loginController")
@RequestMapping("/api/login")
public class LoginController {
    private static final Logger LOG = Logger.getLogger(LoginController.class);
    @Resource
    private IUserInfoService userInfoService;
    /**
     * 登录页面.
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public String loginA() {
        return loginB();
    }
    /**
     * 登录页面.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String loginB() {
        return "use post method";
    }
    /**
     * 登录页面.
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public String loginp(String username, String password) {
        return this.login(username, password);
    }
    /**
     * 登录页面.
     */
    @RequestMapping(value = "/", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String login(String username, String password) {
        Response<String> res;
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            // 用户名或者密码错误
            res = new Response<>(ERROR.PARAM_ERROR, "用户名或者密码为空");
            return res.toJSONString();
        }
        try {
            userInfoService.login(username, password);
            res = new Response<>("OK");
            LOG.info("用户登录成功:" + res.toJSONString());
        } catch (Exception e) {
            res = new Response<>(ERROR.SYS_ERROR, e.getMessage());
        }
        return res.toJSONString();
    }
}
