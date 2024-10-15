package com.mysite.sbbmybatis;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public User getUser(String username) {
		return userMapper.getUserByUsername(username);
	}
	
	public User getUserPsw(String username) {
		return userMapper.getUserPswByUsername(username);
	}
	
	public void signup(User user) {
		user.setPsw(BCrypt.hashpw(user.getPsw(), BCrypt.gensalt()));
		userMapper.signup(user);
	}
}