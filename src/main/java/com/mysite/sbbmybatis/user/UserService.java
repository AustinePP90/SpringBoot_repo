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
	
	public User getUser(User user) {
		return userMapper.getUserByUsrname(user.getUsrname());
	}
	
	public boolean checkUser(User user) {
		// TODO null값 예외처리
		// 사용자 확인
		User member = getUser(user);
		// 비밀번호 확인
		return BCrypt.checkpw(user.getPsw(), member.getPsw());
	}	
}
