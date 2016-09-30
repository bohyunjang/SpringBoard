package com.spring.board.service;

import java.util.List;

import com.spring.board.model.BoardModel;

public interface BoardService {
	
	public List<BoardModel> getList();
	
	public void insert(BoardModel boardModel);
	
	public void delete(BoardModel boardModel, int idx);
	
	public void update(BoardModel boardModel, int idx);
	
}
