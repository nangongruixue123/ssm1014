package com.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="/login", method= RequestMethod.POST)
	public ModelAndView login(@RequestParam(value="username") String username,
			@RequestParam(value="password") String password){
		if("admin".equals(username) && "1".equals(password)){
			return new ModelAndView("redirect:main");
		}
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/main", method= RequestMethod.GET)
	public ModelAndView gotoMain(){
		return new ModelAndView("main");
	}
	

}
