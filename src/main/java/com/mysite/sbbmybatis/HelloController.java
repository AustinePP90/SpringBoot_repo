package com.mysite.sbbmybatis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
    	return "hello";
    }
    
    @GetMapping("/user/login")
    public String login() {

    	return "/user/login";
    }
    

}
