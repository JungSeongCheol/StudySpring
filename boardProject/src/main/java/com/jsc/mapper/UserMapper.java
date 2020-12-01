package com.jsc.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jsc.domain.User;

@Mapper
public interface UserMapper {
	public boolean register(User user) throws Exception;
	public User login(User user) throws Exception;
}
