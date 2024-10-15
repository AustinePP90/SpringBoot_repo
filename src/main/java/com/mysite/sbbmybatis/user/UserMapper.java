package com.mysite.sbbmybatis.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	// signup
	void addUser(User user);
	
	User getUserByUsrname(String usrname);
}
