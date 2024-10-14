package com.mysite.sbbmybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public User getUser(String username) {
		return userMapper.getUserByUsername(username);
//		User user1 = new User();
//		user1.setId(1);
//		user1.setUsername(username);
//		user1.setPsw("1234");
//		LocalDateTime now = LocalDateTime.now();
//		user1.setCreatedAt(now);
//		user1.setUpdatedAt(now);
//		
//		return user1;
	}
}