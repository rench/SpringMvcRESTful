package com.lowang.book.web;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.lowang.book.model.MoliBookInfo;
import com.lowang.book.model.MoliUserInfo;

@RequestMapping("/book")
@Controller("bookLoginController")
public class MoliLoginController {
	@RequestMapping(value={"/login","" },produces={"application/json;charset=utf-8"})
	public  String orderLogin(MoliUserInfo moliuserinfo,HttpServletRequest req, HttpServletResponse res, HttpSession session){
		req.setAttribute("moliuserinfo", moliuserinfo);
		return JSON.toJSONString(moliuserinfo);
	}
	@RequestMapping(value = { "/info/{bookid}" })
	public String bookInfo(@PathVariable String bookid,HttpServletRequest req, HttpServletResponse res, HttpSession session){
		MoliBookInfo molibookinfo = getBookInfo(bookid);
		req.setAttribute("molibookinfo", molibookinfo);
		return "book/login";
		
	}
	private MoliBookInfo getBookInfo(String bookid) {
		MoliBookInfo info= new MoliBookInfo();
		info.setBookid(bookid);
		info.setBookname("mvc");
		info.setBookprice(Double.parseDouble("57"));
		return info;

	}
}

