package com.mysite.sbbmybatis.user;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	// 의존성 주입 @Autowired를 사용
	// UserMapper userMapper = new UserMapper();

	public void addUser(User user) {
		String encPsw = BCrypt.hashpw(user.getPsw(), BCrypt.gensalt());
		user.setPsw(encPsw);
		userMapper.addUser(user);
	}
}
