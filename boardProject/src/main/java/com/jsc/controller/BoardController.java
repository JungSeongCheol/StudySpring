package com.jsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsc.domain.Board;
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
		log.info("list func()");
		
		model.addAttribute("list", boardService.list());
		
//		model.addAttribute("count", boardService.cnt());
		
		return "/board/list";
	}

	@GetMapping("/read")
	public String read(@RequestParam("bno") int bno, Model model) throws Exception {
		model.addAttribute("read", boardService.read(bno));
		
		return "/board/read";
	}
	
	@GetMapping("/register")
	public void registerForm() {
		
	}

	@PostMapping("/register")
	public String registerPro(Board board) throws Exception {
		boardService.register(board);
		return "redirect:/board/list";
	}
	
	@GetMapping("/modify")
	public String modifyForm(@RequestParam("bno") int bno, Model model) throws Exception {
		model.addAttribute("board", boardService.read(bno));
		
		return "/board/modify";
	}
	
	@PostMapping("/modify")
	public String modifyPro(Board board) throws Exception{
		boardService.modify(board);
		return "redirect:/board/list";
	}
	
	@GetMapping("/remove")
	public String remove(@RequestParam("bno") int bno, Model model) throws Exception {
		boardService.remove(bno);
		return "redirect:/board/list";
	}
}
