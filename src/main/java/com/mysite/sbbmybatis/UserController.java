package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping("/user/login")
	public String login() {
		return "/user/login";
	}

	@GetMapping("/user/{usrname}")
//    @ResponseBody
	public String getUser(@PathVariable("usrname") String usrname, Model model) {
		User user = service.getUser(usrname);
		model.addAttribute("user", user);
		return "/user/detail";
	}
}
