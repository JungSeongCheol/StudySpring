package com.jsc.service;

import com.jsc.domain.User;

public interface UserService {
	public boolean register(User user) throws Exception;
	public boolean login(User user) throws Exception;
}
