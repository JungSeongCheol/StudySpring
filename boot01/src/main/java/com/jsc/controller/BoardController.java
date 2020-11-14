package com.jsc.controller;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsc.domain.BoardV0;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/board")
public class BoardController {
	
	//@RequestMapping(value="/register", method = RequestMethod.GET)
	@GetMapping("/register")
	public String registerForm() {
		return "board/register"; // 보내는 이름과 다르면 이런식으로 밑에 Post형식으로 되기때문에 이름이 같아도됨(Get은 안됨)
	}
	
	
	@PostMapping("register")
	public String register(@ModelAttribute("board") BoardV0 board) { //ModelAttribute를 사용하면 객체를 강제로 밀어넣어서 이름이 설사 겹치는 부분이 있다 하더라도 사용가능하다.
		log.info("board: " + board);
		return "board/read";
	}
	
	
//	@PostMapping("register")
//	public String register(BoardV0 boardV0) { // board라고 적으면 readFile에 board.~~라고 써도 안됨.(log까지는 가지만 board/read return을 통해 뷰로는 가지 않는다.)(이름이 겹치는 부분이 있으면 작동이 되지않음)
//		log.info("board: " + boardV0);
//		return "board/read";
//	}
	
//	@PostMapping("/register")
//	public String register(HttpServletRequest request, Model model) {
//		
//		String title = request.getParameter("title");
//		String content = request.getParameter("content");
//		String writer = request.getParameter("writer");
//		model.addAttribute("board", new BoardV0(1, title, content, writer));
//		return "board/read";
//	}
	
	@GetMapping("/login")
	public String login(@RequestParam("id") String id, String pw, Model model) {
		log.info("id=" + id);
		log.info("pw=" + pw);
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board/result";
	}
	
	@GetMapping("/bno/{bno}")
	public String bnoRequest(@PathVariable("bno") int bno, Model model) {
		model.addAttribute("bno", bno);
		return "board/bno";
	}
	
	@GetMapping("/read")
	public void read(Model model) {
		BoardV0 boardV = new BoardV0(1, "스프링 게시판", "스프링 게시판 작성 방법입니다", "홍길동");
		//System.out.println(boardV);
		model.addAttribute("boardv", boardV);
		log.info("baord: "+ boardV);
		// return "board
	}
}
