package com.lowang.order.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.lowang.order.model.UserInfo;

@RequestMapping("/order")
@Controller("orderLoginController")
public class LoginController {

	@RequestMapping(value = { "/login", "" },produces={"application/json;charset=utf-8"})
	public String orderLogin(UserInfo userinfo,HttpServletRequest req, HttpServletResponse res, HttpSession session) {
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
		System.out.println(userinfo.getUsername()+ ":" + userinfo.getPassword());
		System.out.println("haha");
		req.setAttribute("time", "2016-07");
		req.setAttribute("userinfo", userinfo);
		return "login";
 }

	@RequestMapping(value = { "/info/{orderid}" })
	public String orderInfo(@PathVariable String orderid) {
		System.out.println("haha:" + orderid);
		return null;
	}

}
