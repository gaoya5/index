package com.etoak.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etoakdao.LoginDaoIf;



@Service
public class LoginService {
	@Autowired
	private LoginDaoIf dao;
	public String login(String name, String pass) {
		System.out.println("name------>"+name);
		System.out.println("pass------>"+pass);
		Map map = new HashMap();
		map.put("name", name);
		map.put("pass", pass);
		String x = dao.login(map);
		return x;
	}

}
