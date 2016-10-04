package com.spring.board.repository;

import java.util.List;
import java.util.Map;

import com.spring.board.model.BoardModel;
import com.spring.board.model.BoardSearchModel;

public interface BoardRepository {

	List<BoardModel> selectList();

	BoardModel selectOne(int idx);

	int selectIdx();

	void insert(BoardModel boardModel);

	void update(BoardModel boardModel, int idx);

	void delete(int idx);
	
	void updateCnt(BoardModel boardModel, int idx);
	
	List<BoardModel> search(BoardSearchModel boardSearchModel);

}
