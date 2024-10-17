package com.mysite.sbbmybatis.users;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getUser() {
		return userMapper.getUser();
	}
	
	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}
	
	public void signup(User users) {
		users.setPsw(BCrypt.hashpw(users.getPsw(), BCrypt.gensalt()));
		userMapper.signup(users);
	}
}
