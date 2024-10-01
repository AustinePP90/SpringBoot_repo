package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService2 {
	@Autowired
	private MessageMapper2 messageMapper2;
	
	public Message getMessage(Integer id) {
		return messageMapper2.getMessage(id);
	}
	
	public void insertMessage(Message message) {
		messageMapper2.insertMessage(message);
	}
}