package com.spring.board.repository.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.model.BoardModel;
import com.spring.board.repository.BoardRepository;

import db.mysql.mapper.BoardMapper;

@Repository
public class BoardRepositoryImpl implements BoardRepository{

	/*@Resource(name="boardMapper")
	private BoardMapper boardMapper;*/
	
	//private SqlSession sqlSession;

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardModel> selectList() {
		// TODO Auto-generated method stub
		
		System.out.println("boardRepositoryImpl.. selectList");
		
		
		List<BoardModel> list = this.sqlSession.selectList("BoardMapper.selectList");
		
		System.out.println("list :: "+list);
		
		return list;
	}

	@Override
	public BoardModel selectOne(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int seqMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(BoardModel boardModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BoardModel boardModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int idx) {
		// TODO Auto-generated method stub
		
	}
	
		
	
	
}
