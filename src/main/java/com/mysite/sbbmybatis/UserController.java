package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
//	@Autowired
//	private HelloService service;

    
    @GetMapping("/user/login")
    public String login() {
    	return "/user/login";
    }

	
    @GetMapping("/user/yang")
//    @ResponseBody
    public String getUser() {
    	return "/user/detail";
    }
}
