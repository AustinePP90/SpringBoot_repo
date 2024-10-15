package com.mysite.sbbmybatis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
//    @ResponseBody
    public String hello(Model model) {
        model.addAttribute("message", "오늘도 나는 Hello World를 친다...^^");
        model.addAttribute("comment", "야 너도...?");
    	return "hello";
    }
    
    @GetMapping("/bye")
    @ResponseBody
    public String bye() {
    	return "Hello World... Bye";
    }
    
    @GetMapping("/")
    public String home() {
    	return "home";
    }
}
