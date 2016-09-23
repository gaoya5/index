package com.etoak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etoak.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	@RequestMapping("/login")
	public String pay(@RequestParam("name")String name,
					  @RequestParam("pass")String pass)throws Exception{
		System.out.println("name------>controller"+name);
		System.out.println("pass------>controller"+pass);
		String result = service.login(name, pass);
		System.out.println("result----->"+result);
		if(result == null){
			return "redirect:error.jsp";
		}
		return "redirect:success.jsp";
	}
}
