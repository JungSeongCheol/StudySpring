package com.jsc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jsc.domain.Board;

@Mapper
public interface BoardMapper {
	public int create(Board board) throws Exception;
	public Board read(int bno) throws Exception;
	public int readcntUpdate(int readcnt) throws Exception;
	public int update(Board board) throws Exception;
	public int delete(int bno) throws Exception;
	public List<Board> list() throws Exception;
	public int count() throws Exception;
}