package com.lowang.user.web;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lowang.core.model.Response;
import com.lowang.core.model.Response.ERROR;
import com.lowang.core.model.vo.UserRegResponse;

/**
 * 注册类.
 * @author Lo&Wang
 */
@Controller("regController")
@RequestMapping("/api/users/reg")
public class RegController {
    @RequestMapping(value = "", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String regA(String username, String password, String qq) {
        return this.regB(username, password, qq);
    }
    @RequestMapping(value = "/", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String regB(String username, String password, String qq) {
        Response<UserRegResponse> res;
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password) || StringUtils.isBlank(qq)) {
            res = new Response<UserRegResponse>(ERROR.PARAM_ERROR, "注册信息不完整");
        } else {
            UserRegResponse reg = new UserRegResponse();
            reg.setUsername(username);
            reg.setQq(qq);
            reg.setRegtime(new Date());
            res = new Response<UserRegResponse>(reg);
        }
        return res.toJSONString();
    }
}
