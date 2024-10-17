package com.mysite.sbbmybatis.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
		@Autowired
		private UserService userService;

		@GetMapping
		public List<User> getUser() {
			return userService.getUser();
		}
		
		@GetMapping("/{id}")
		public User getUser(@PathVariable("id") int id) {
			return userService.getUserById(id);
		}
		
		@PostMapping("/signup")
		public void signup(@RequestBody User users) {
			userService.signup(users);
		}
}
