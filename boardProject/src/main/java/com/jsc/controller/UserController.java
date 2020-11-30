package com.jsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsc.domain.Board;
import com.jsc.domain.User;
import com.jsc.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/Login")
	public void Login() {
		
	}
	
	@PostMapping("/Login")
	public String Login(String id, String pw) throws Exception {
		
		return "/board/list";
	}
	
	@GetMapping("/Register")
	public void Register() {
		
	}
	
	@PostMapping("/Register")
	public String RegisterPro(User user) throws Exception {
		userService.register(user);
		return "redirect:/board/list";
	}
}
