package com.jsc.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jsc.domain.User;

@Mapper
public interface UserMapper {
	public void register(User user) throws Exception;
	public User login() throws Exception;
	public void logout() throws Exception;
}
