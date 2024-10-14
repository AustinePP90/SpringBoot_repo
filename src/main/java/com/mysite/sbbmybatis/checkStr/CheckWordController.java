package com.mysite.sbbmybatis.checkStr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.sbbmybatis.Message;
import com.mysite.sbbmybatis.MessageService;

@Controller
@RequestMapping("/checkword")
public class CheckWordController {
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/{word}")
	@ResponseBody
	public boolean checkWord(@PathVariable("word") String userWord) {
		// dbWord		
		Message message = messageService.getMessage(1);
		String dbWord = message.getMessage();
		
		// userWord.equals(dbWord)
		boolean result = userWord.equals(dbWord);
		
		return result;
	}
	
	@GetMapping("/form")
	public String checkWordForm ( ) {
		return "checkword";
	}
	
	// get으로 요청된 값을 받을때는 @RequestParam을 사용
	@GetMapping
	@ResponseBody
	public boolean checkWord2(@RequestParam("word") String userWord) {
		return true;
	}
}
