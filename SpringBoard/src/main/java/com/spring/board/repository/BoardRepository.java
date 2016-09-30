package com.spring.board.repository;

import java.util.List;

import com.spring.board.model.BoardModel;

public interface BoardRepository {

	List<BoardModel> selectList();

	BoardModel selectOne(int idx);

	int seqMax();

	void insert(BoardModel boardModel);

	void update(BoardModel boardModel);

	void delete(int idx);

}
