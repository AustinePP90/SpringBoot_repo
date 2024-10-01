package com.mysite.sbbmybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/comment")
public class MessageController2 {
	@Autowired
	private MessageService2 messageService2;
	
	@GetMapping("/{id}")
	@ResponseBody
	public Message getMessage(@PathVariable("id") Integer id) {
		return messageService2.getMessage(id);
	}
	
	@GetMapping("/insert")
	public String insert() {
		return "create-message";
	}
	
	@GetMapping("/api")
	@ResponseBody
	public List<Message> getMessageList() {
		return messageService2.getMessageList();
	}
	
	@GetMapping
	public String messageList() {
		return "messages";
	}
	
	@PostMapping
	@ResponseBody
	public void insertMessage(Message message) {
		messageService2.insertMessage(message);
	}
}