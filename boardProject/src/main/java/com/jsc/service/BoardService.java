package com.jsc.service;

import java.util.List;

import com.jsc.domain.Board;

public interface BoardService {
	// mybatis 사용시
	public void register(Board board) throws Exception;
	public List<Board> list() throws Exception;
	public Board read(int bno) throws Exception;
	public int readcntUpdate(int bno) throws Exception;
	public void modify(Board board) throws Exception;
	public void remove(int bno) throws Exception;
	public int cnt() throws Exception;
	
	/*// jdbcTemplate 사용시
	public void register(Board board) throws Exception;
	public List<Board> list() throws Exception;
	public Board read(int bno) throws Exception;
	public void modify(Board board) throws Exception;
	public void remove(int bno) throws Exception;
	*/
	
}
