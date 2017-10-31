package com.yuan.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yuan.model.User;
import com.yuan.service.UserService;
import com.yuan.util.MD5;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/login", method= RequestMethod.POST)
	public ModelAndView login(@RequestParam(value="username") String username,
			@RequestParam(value="password") String password){
		ModelAndView view = new ModelAndView("login");
		if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
			view.addObject("msg", "请输入用户名或者密码");
			return view;
		}
		User u = userService.findUserByUsername(username);
		if(u == null){
			view.addObject("msg", "用户名或者密码错误!");
			return view;
		}
		String salt = u.getSalt();
		String passwordMD5 = MD5.getMD5Code(salt+password);
		if(u.getPassdword().equals(passwordMD5)){
			return new ModelAndView("redirect:main");
		}
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/main", method= RequestMethod.GET)
	public ModelAndView gotoMain(){
		return new ModelAndView("main");
	}
	

}
