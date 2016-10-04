package com.spring.board.model;

public class BoardSearchModel {

	/*
		Search 의 type 과 value 를 저장하기 위한 Model
	*/
	
	String searchType;
	String searchValue;
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	
	
	
}
