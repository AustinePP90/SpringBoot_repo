package com.mysite.sbbmybatis;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper2 {
	Message getMessage(Integer id);
	
	void insertMessage(Message message);
}
