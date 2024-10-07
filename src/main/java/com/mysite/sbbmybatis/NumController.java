package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class NumController {
	@Autowired
	private NumService service;
	
    @GetMapping
    @ResponseBody
    public String hello() {
    	return "Hello World ^^!";
    }
    
    @GetMapping("/{id}")
    @ResponseBody
    public Numbers getNum(@PathVariable("id") int id) {
    	return service.getNum(id);
    }
    
    @GetMapping("/input")
    public String inputNum() {
    	return "num";
    }
    
    @PostMapping
    @ResponseBody
    public void inputNum(@RequestBody Numbers num) {
    	service.inputNum(num);
    }
}
