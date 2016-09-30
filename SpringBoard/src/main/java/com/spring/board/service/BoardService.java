package com.spring.board.service;

import java.util.List;

import com.spring.board.model.BoardModel;

public interface BoardService {
	
	public List<BoardModel> getList();
	
	public int selectIdx();	
	
	public BoardModel selectOne(int idx);
	
	public void insert(BoardModel boardModel);
	
	public void delete(int idx);
	
	public void update(BoardModel boardModel, int idx);
	
	public void updateCnt(BoardModel boardModel, int idx);
	
}
