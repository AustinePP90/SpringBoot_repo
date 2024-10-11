package com.mysite.sbbmybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	@Autowired
	private MessageMapper messageMapper;
	
	public Message getMessage(Integer id) {
		return messageMapper.getMessageById(id);
//		return id;
	}
	
	public void createMessage(Message message) {
		messageMapper.insertMessage(message);
	}
	
	public List<Message> getMessagesLimit10() {
		return messageMapper.getMessagesLimit10();
	}
	
	public PageDTO getPagedData(int page, int size) {
		int offset = (page - 1) * size;
        List<Message> content = messageMapper.getMessagesWithPaging(offset, size);
        int totalElements = messageMapper.countTotal();
        int totalPages = (int) Math.ceil((double) totalElements / size);

        return new PageDTO(page, size, totalPages, totalElements, content);
	}
}
