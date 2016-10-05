package com.spring.board.repository.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.support.BooleanTypedValue;
import org.springframework.stereotype.Repository;

import com.spring.board.model.BoardModel;
import com.spring.board.model.BoardSearchModel;
import com.spring.board.repository.BoardRepository;

import db.mysql.mapper.BoardMapper;

@Repository
public class BoardRepositoryImpl implements BoardRepository{

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardModel> selectList() {
		// TODO Auto-generated method stub
		System.out.println("boardRepositoryImpl.. selectList");
		List<BoardModel> list = this.sqlSession.selectList("BoardMapper.selectList");
		
		return list;
	}

	@Override
	public void insert(BoardModel boardModel) {
		// TODO Auto-generated method stub
		System.out.println("boardRepositoryImpl... insert...");
		this.sqlSession.insert("BoardMapper.insert",boardModel);
	}

	@Override
	public int selectIdx() {
		// TODO Auto-generated method stub
		System.out.println("boardRepositoryImpl... selectIdx..");
		
		return this.sqlSession.selectOne("BoardMapper.selectIdx");
		
	}

	@Override
	public List<BoardModel> search(BoardSearchModel searchModel) {
		// TODO Auto-generated method stub
		
		if(searchModel!=null){
			System.out.println("boardRepository... boardSearch.");
		}
		
		List<BoardModel> searchList = this.sqlSession.selectList("BoardMapper.search", searchModel);
		
		return searchList;
	}
	
	@Override
	public BoardModel selectOne(int idx) {
		// TODO Auto-generated method stub
		System.out.println("boardRepositoryImpl... selectOne...");
		
		return this.sqlSession.selectOne("BoardMapper.selectOne",idx);
	}

	@Override
	public void update(BoardModel boardModel,int idx) {
		// TODO Auto-generated method stub
		System.out.println("boardRepositoryImpl... update...");
		
		this.sqlSession.update("BoardMapper.update",idx);
	}

	@Override
	public void delete(int idx) {
		// TODO Auto-generated method stub
		System.out.println("boardReposityroyImpl... delete..");
		
		this.sqlSession.delete("BoardMapper.delete", idx);
	}

	@Override
	public void updateCnt(BoardModel boardModel, int idx) {
		// TODO Auto-generated method stub
		System.out.println("boardCnt Update...");
		
		this.sqlSession.update("BoardMapper.updateCnt", idx);
	}



	
	
}
