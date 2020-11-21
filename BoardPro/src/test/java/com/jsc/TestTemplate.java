package com.jsc;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jsc.dao.BoardDAO;
import com.jsc.domain.Board;

import lombok.extern.java.Log;

@Log
@SpringBootTest
public class TestTemplate {
	@Autowired
	BoardDAO boardDAO;
	
	@Test
	public void insertTest() throws Exception{
		Board board = new Board();
		board.setTitle("제목입니다");
		board.setContent("내용입니다");
		board.setWriter("user00");
		
		boardDAO.create(board);
	}
	
	@Test
	public void listTest() throws Exception {
		List<Board> list = boardDAO.list();
		
		for (int i = 0; i < list.size(); i++) {
			log.info("board:" + list.get(i));
		}
	}
	
	@Test
	public void listTest2() throws Exception {
		List<Board> list = boardDAO.list();
		list.forEach(board->log.info("board:"+board));
	}
	
	@Test
	public void readTest() throws Exception {
		Board board = boardDAO.read(1);
		log.info("bno 1번 게시물:"+board);
	}
	
	@Test
	public void updateTest() throws Exception{
		Board board = new Board();
		board.setBno(6);
		board.setTitle("수정된 제목입니다.");
		board.setContent("수정된 내용입니다.");
		board.setWriter("updateUser");
		boardDAO.update(board);
	}
	
	@Test
	public void deleteTest() throws Exception{
		boardDAO.delete(4);
	}
}
