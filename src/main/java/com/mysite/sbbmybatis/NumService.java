package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumService {
	@Autowired
	private NumMapper mapper;
	
	public Numbers getNum(int id) {
		return mapper.getNum(id);
	}
	
	public void inputNum(Numbers number) {
		mapper.inputNum(number);
	}
}
