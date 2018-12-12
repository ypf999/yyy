package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pojo.User;

@Controller
public class UserController {

	@RequestMapping(value="/regist",method=RequestMethod.GET)
	public String regist(@ModelAttribute("user") User user) {
		//@ModelAttribute 用于表示该对象为响应参数
		//说明user对象用于向网页发送数据
		user.setAge(18);
		user.setEmail("example@mail.com");
		user.setPhone("18320302339");
		return "regist";
	}
	@RequestMapping(value="/regist",method=RequestMethod.POST)
	public String regist(@Valid User user,BindingResult result,HttpServletRequest request) {
		//@Valid用于标明该对象必须经过jsr-303验证
		//BindingResult用于封装验证结果
		if(result.hasErrors()) {
			//验证失败
			return "regist";
		}else {
			request.setAttribute("msg", "注册成功");
			return "message";
		}
	}
	
	
	
	
	
	
}
