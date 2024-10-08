package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserMapper mapper;
	
	public User getUser(String usrname) {
		return mapper.getUserByUserName(usrname);
	}
}
