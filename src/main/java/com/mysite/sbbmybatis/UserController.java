package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@Autowired
	private UserService service;

    
    @GetMapping("/user/login")
    public String login() {
    	return "/user/login";
    }

	
    @GetMapping("/user/{usrname}")
    @ResponseBody
    public User getUser(@PathVariable("usrname") String usrname) {
    	return service.getUser(usrname);
    }
}
