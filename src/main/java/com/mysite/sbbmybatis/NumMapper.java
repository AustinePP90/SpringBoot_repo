package com.mysite.sbbmybatis;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NumMapper {
	Numbers getNum(int id);
	
	void inputNum(Numbers num);
}
