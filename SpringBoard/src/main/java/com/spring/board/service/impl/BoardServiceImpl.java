package com.spring.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.model.BoardModel;
import com.spring.board.repository.BoardRepository;
import com.spring.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardRepository boardRepository;
	
	@Override
	public List<BoardModel> getList() {
		// TODO Auto-generated method stub
		System.out.println("boardService.... getList");
		
		return this.boardRepository.selectList();
	}
	
	@Override
	public void insert(BoardModel boardModel) {
		// TODO Auto-generated method stub
		System.out.println("boardService... boardInsert..");

		this.boardRepository.insert(boardModel);
	}
	
	
	@Override
	public int selectIdx() {
		// TODO Auto-generated method stub
		System.out.println("boardService... selectIdx...");
		
		return this.boardRepository.selectIdx();
	}

	@Override
	public void delete(int idx) {
		// TODO Auto-generated method stub
		System.out.println("boardService... boardDelete..");
		this.boardRepository.delete(idx);
	}

	@Override
	public void update(BoardModel boardModel, int idx) {
		// TODO Auto-generated method stub
		
		System.out.println("boardService... boardUpdate..");
		this.boardRepository.update(boardModel,idx);
	}

	@Override
	public BoardModel selectOne(int idx) {
		// TODO Auto-generated method stub
		
		System.out.println("boardService... boardView..");
		return this.boardRepository.selectOne(idx);
	}

	@Override
	public void updateCnt(BoardModel boardModel, int idx) {
		// TODO Auto-generated method stub
		System.out.println("boardService... boardUpdateCnt");
		
		this.boardRepository.updateCnt(boardModel, idx);
	}
	
}