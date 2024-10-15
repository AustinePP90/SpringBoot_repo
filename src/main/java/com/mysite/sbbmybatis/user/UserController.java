package com.mysite.sbbmybatis.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	// GetMapping /user/signup
	@GetMapping("/signup")
	public String signupPage() {
		return "/user/signup";
	}

	// PostMapping /user/signup
	@PostMapping("/signup")
	public void signup(@ModelAttribute("user") User user) {
		System.out.println(user.toString());
	}

	// GetMapping /user/login
	// PostMapping /user/login
}
