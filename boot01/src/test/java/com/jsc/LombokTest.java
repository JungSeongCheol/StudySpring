package com.jsc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.jsc.domain.BoardV0;

import lombok.extern.java.Log;

@Log
@SpringBootTest
public class LombokTest {
	
	@Test
	public void test01() {
		BoardV0 vo = new BoardV0();
		log.info("test01 입니다" + vo);
	}
	
	@Test
	public void test02() {
		BoardV0 vo = new BoardV0(1, "title", "content1", "user");
		log.info("test02"+ vo);
	}
	
	@Test
	public void testGetterSetter() {
		BoardV0 board = new BoardV0();
		board.setTitle("게시판 제목");
		board.setContent("게시물 내용");
		log.info(board.getTitle());
		log.info(board.getContent());
	}
	
	@Test
	public void testToString() {
		BoardV0 board = new BoardV0();
		board.setBno(1);
		board.setTitle("제목1");
		board.setContent("내용1");
		board.setWriter("user00");
		log.info(board.toString());
	}
}
