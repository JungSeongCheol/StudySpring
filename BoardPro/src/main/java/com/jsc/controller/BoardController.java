package com.jsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsc.service.BoardService;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/list")
	public String list(Model model) throws Exception {
		model.addAttribute("list", boardService.list());
		
		return "/board/list";
	}

	@GetMapping("/read")
	public String read(@RequestParam("bno") int bno, Model model) throws Exception {
		model.addAttribute("read", boardService.read(bno));
		
		return "/board/read";
	}
}
