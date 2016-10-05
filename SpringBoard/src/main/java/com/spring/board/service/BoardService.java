package com.spring.board.service;

import java.util.List;
import java.util.Map;

import com.spring.board.model.BoardModel;
import com.spring.board.model.BoardSearchModel;

public interface BoardService {
	
	public List<BoardModel> getList();
	
	public int selectIdx();	
	
	public BoardModel selectOne(int idx);
	
	public void insert(BoardModel boardModel);
	
	public void delete(int idx);
	
	public void update(BoardModel boardModel, int idx);
	
	public void updateCnt(BoardModel boardModel, int idx);
	
	List<BoardModel> search(BoardSearchModel boardSearchModel);
	
}
