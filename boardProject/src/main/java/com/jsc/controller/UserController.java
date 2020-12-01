package com.jsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView Login(User user) throws Exception {
		boolean check = userService.login(user);
		ModelAndView mav = new ModelAndView();
		if(check == false) {
			mav.setViewName("/User/Login");
			mav.addObject("LoginCheck", "fail");
		}
		else {
			mav.setViewName("/board/list");
			mav.addObject("LoginCheck", "Success");
		}
		
		return mav;
	}
	
	@GetMapping("/Register")
	public void Register() {
		
	}
	
	@PostMapping("/Register")
	public ModelAndView RegisterPro(User user) throws Exception {
		boolean check = userService.register(user);
		ModelAndView mav = new ModelAndView();
		if(check == false) {
			mav.setViewName("/User/Register");
			mav.addObject("msg", "fail");
		}
		else {
			mav.setViewName("/User/Login");
			mav.addObject("msg", "success");
		}
		return mav;
	}
}
