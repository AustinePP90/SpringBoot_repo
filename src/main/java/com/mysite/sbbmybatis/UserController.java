package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "/user/login";
	}
	
	@PostMapping("/login")
	public void login2(@RequestBody User user) {
		User newUser = user;
		
	}
	
	// 상세정보 /user/hong
	@GetMapping("/{username}")
//	@ResponseBody
	public String getUser(@PathVariable("username") String username, Model model) {
		User user = userService.getUser(username);
		model.addAttribute("user", user);
		return "/user/detail";
	}
}