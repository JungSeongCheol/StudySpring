package com.jsc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsc.dao.BoardDAO;
import com.jsc.domain.Board;

@Service
public class BoardServiceImpl implements BoardService {
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
	}
	
}
