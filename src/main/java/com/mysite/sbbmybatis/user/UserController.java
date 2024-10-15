package com.mysite.sbbmybatis.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("user/signup")
	public String signupPage() {
		return "/user/signup";
	}

	@PostMapping("user/signup")
	public String signup(@ModelAttribute("user") User user) {
		System.out.println(user.toString());
		userService.addUser(user);
		return "redirect:/"; // 현재 페이지에서 페이지를 바꾸라고 요청
	}
	
	// 파라미터(Param)를 매개값으로 받아서 요청 처리
	@PostMapping("user/signupParam")
	public String signupParam(@RequestParam("usrname") String usrname,
							  @RequestParam("psw") String psw) {
		User newUser = new User();
		newUser.setUsrname(usrname);
		newUser.setPsw(psw);
		userService.addUser(newUser);
		return "redirect:/"; // 현재 페이지에서 페이지를 바꾸라고 요청
	}

	@GetMapping("user/login")
	public String loginPage() {
		return "/user/login";
	}
	
	// 사용자명 및 비밀번호 확인
	// 비밀번호를 DB에서 찾아 요청 비밀번호와 DB의 비밀번호를 비교
	@PostMapping("/user/login")
	public String login(@ModelAttribute("user") User user) {
		boolean isUser = userService.checkUser(user);
		if (isUser) {
			// 로그인 성공
			return "redirect:/";
		} else {
			// 로그인 실패
			return "redirect:/user/login";
		}
	}
}
