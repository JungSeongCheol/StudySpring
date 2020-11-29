package com.jsc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsc.domain.Board;
import com.jsc.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class BoardServiceImpl implements BoardService {

	BoardMapper boardMapper;
	
	@Override
	public void register(Board board) throws Exception {
		boardMapper.create(board);
	}

	@Override
	public List<Board> list() throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.list();
	}

	@Override
	public Board read(int bno) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.read(bno);
	}

	@Override
	public void modify(Board board) throws Exception {
		// TODO Auto-generated method stub
		boardMapper.update(board);
	}

	@Override
	public void remove(int bno) throws Exception {
		// TODO Auto-generated method stub
		boardMapper.delete(bno);
	}

	@Override
	public int cnt() throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.count();
	}
	
	
	/*
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public void register(Board board) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.create(board);
	}

	@Override
	public List<Board> list() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.list();
	}

	@Override
	public Board read(int bno) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.read(bno);
	}

	@Override
	public void modify(Board board) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.update(board);
	}

	@Override
	public void remove(int bno) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.delete(bno);
	}*/
	
}
