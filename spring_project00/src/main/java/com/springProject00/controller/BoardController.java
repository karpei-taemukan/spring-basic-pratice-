package com.springProject00.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springProject00.dto.Board;
import com.springProject00.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService bsvc;
	
	@RequestMapping(value="/boardWriteForm")
	public ModelAndView boardWriteForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/boardWriteForm");
		return mav;
	}
	@RequestMapping(value="/boardWrite")
	public ModelAndView boardWrite(Board board) {
		System.out.println("/boardWriteForm 요청");
		System.out.println(board);
		
		//  service 호출
		int writeResult = bsvc.boardWrite_svc(board);
		if(writeResult > 0) {
			System.out.println("글 등록 성공");
		}
		else {
			System.out.println("글 등록 실패");
		}
		return null;
	}
}
