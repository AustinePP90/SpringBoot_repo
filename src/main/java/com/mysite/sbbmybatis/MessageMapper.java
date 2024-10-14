package com.mysite.sbbmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MessageMapper {
	Message getMessageById(Integer id);

	void insertMessage(Message message);

	List<Message> getMessagesLimit10(); // return 값이 하나가 아님 -> List<>사용 -> <Message>타입만 사용하겠다!
	
	List<Message> getMessagesWithPaging(@Param("size") Integer size, @Param("offset") Integer offset);
	Integer countTotal();
}
