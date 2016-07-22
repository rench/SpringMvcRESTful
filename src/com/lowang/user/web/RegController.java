package com.lowang.user.web;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.lowang.core.model.Response;
import com.lowang.core.model.Response.ERROR;
import com.lowang.core.model.bo.UserInfoBo;
import com.lowang.core.model.vo.UserRegResponse;
import com.lowang.user.service.IUserInfoService;

/**
 * 注册类.
 * @author Lo&Wang
 */
@Controller("regController")
@RequestMapping("/api")
public class RegController {
    private static final Logger LOG = Logger.getLogger(RegController.class);
    @Resource
    private IUserInfoService userInfoService;
    @RequestMapping(value = {"/reg"}, method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String reg(String username, String password, String qq) {
        Response<UserRegResponse> res;
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password) || StringUtils.isBlank(qq)) {
            res = new Response<UserRegResponse>(ERROR.PARAM_ERROR, "注册信息不完整");
        } else {
            UserInfoBo userinfo = new UserInfoBo();
            userinfo.setUsername(username);
            userinfo.setPassword(password);
            userinfo.setQq(qq);
            try {
                userInfoService.reg(userinfo);
            } catch (Exception e) {
                e.printStackTrace();
                return new Response<>(ERROR.SYS_ERROR, e.getMessage()).toJSONString();
            }
            UserRegResponse reg = new UserRegResponse();
            reg.setUsername(username);
            reg.setQq(qq);
            reg.setRegtime(userinfo.getRegtime());
            res = new Response<UserRegResponse>(reg);
            LOG.info("用户注册成功:" + JSON.toJSONString(userinfo));
        }
        return res.toJSONString();
    }
}
