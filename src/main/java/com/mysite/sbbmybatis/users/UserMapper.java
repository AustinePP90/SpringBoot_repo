package com.mysite.sbbmybatis.users;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	List<User> getUser();
	
	User getUserById(int id);
	
	void signup(User users);
}
