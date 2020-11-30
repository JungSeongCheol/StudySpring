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
	public void register(User user) throws Exception {
		// TODO Auto-generated method stub
		userMapper.register(user);
	}

	@Override
	public User login(String id, String pw) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.login();
	}

	@Override
	public void logout() throws Exception {
		// TODO Auto-generated method stub

	}

}
