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
		// TODO Auto-generated meth od stub
		
		System.out.println("boardService.... getList");
		List<BoardModel> list = this.boardRepository.selectList();
		
		/*return this.boardRepository.getList();*/
		System.out.println("lst??:"+list);
		return list;
	}

	@Override
	public void insert(BoardModel boardModel) {
		// TODO Auto-generated method stub
		
		this.boardRepository.insert(boardModel);
		
	}

	@Override
	public void delete(BoardModel boardModel, int idx) {
		// TODO Auto-generated method stub
		
		this.boardRepository.delete(idx);
	}

	@Override
	public void update(BoardModel boardModel, int idx) {
		// TODO Auto-generated method stub
		
		this.boardRepository.update(boardModel);
	}

	
}
