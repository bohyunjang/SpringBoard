package com.spring.board.repository;

import java.util.List;

import com.spring.board.model.BoardModel;

public interface BoardRepository {

	List<BoardModel> selectList();

	BoardModel selectOne(int idx);

	int selectIdx();

	void insert(BoardModel boardModel);

	void update(BoardModel boardModel, int idx);

	void delete(int idx);
	
	void updateCnt(BoardModel boardModel, int idx);

}
