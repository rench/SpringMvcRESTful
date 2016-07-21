package com.lowang.user.web;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lowang.core.Const;
import com.lowang.core.model.Response;
import com.lowang.core.model.Response.ERROR;

/**
 * 登录类.
 * @author Lo&Wang
 */
@Controller("loginController")
@RequestMapping("/api/login")
public class LoginController {
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
        if (Const.username.equalsIgnoreCase(username) && Const.password.equalsIgnoreCase(password)) {
            res = new Response<>("OK");
        } else {
            res = new Response<>(ERROR.AUTH_ERROR, "用户名或者密码错误");
        }
        return res.toJSONString();
    }
}
