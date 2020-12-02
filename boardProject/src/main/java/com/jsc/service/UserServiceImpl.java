package com.jsc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsc.domain.User;
import com.jsc.mapper.UserMapper;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public boolean register(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.register(user);
	}

	@Override
	public boolean login(User user) throws Exception {
		// TODO Auto-generated method stub
		if(userMapper.login(user) == null) {
			return false;
		}
		return true;
	}
}
