package com.spring.board.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.board.model.BoardModel;
import com.spring.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService BoardService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String BoardList(Model model){
		
		System.out.println("move List controller");
		List<BoardModel> list = this.BoardService.getList(); 
		System.out.println("list??"+list);
		model.addAttribute("list",list);
		
		return "board_list";
	}
	
	
	@RequestMapping(value="/write",method=RequestMethod.GET)
	public String moveBoardWrite(@RequestParam(value="idx", defaultValue="0") int idx){
		System.out.println("boardController.... move Write..");
		
		return "board_write";
	}
	
	
	@RequestMapping(value="/{idx}")
	public String moveBoardView(@PathVariable int idx, Model model){
		System.out.println("boardController.... move View..");
		
		return "board_view";
	}
	
}
