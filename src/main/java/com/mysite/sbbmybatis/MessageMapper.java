package com.mysite.sbbmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {
	Message getMessageById(Integer id);

	void insertMessage(Message message);

	List<Message> getMessagesLimit10(); // return 값이 하나가 아님 -> List<>사용 -> <Message>타입만 사용하겠다!
}
