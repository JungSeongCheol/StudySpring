package com.jsc.service;

import com.jsc.domain.User;

public interface UserService {
	public void register(User user) throws Exception;
	public User login(String id, String pw) throws Exception;
	public void logout() throws Exception;
}
