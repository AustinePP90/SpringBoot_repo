package com.mysite.sbbmybatis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String signup() {
		return "/users/fetch-user";
	}
}
