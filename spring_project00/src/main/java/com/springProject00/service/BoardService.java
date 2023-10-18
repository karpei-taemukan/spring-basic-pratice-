package com.springProject00.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springProject00.dao.BoardDao;
import com.springProject00.dto.Board;

@Service
public class BoardService {

	@Autowired
	private BoardDao bdao;
	public int boardWrite_svc(Board board) {
		System.out.println("boardWrite_svc()호출");
		int insertResult = bdao.insertBoard(board);
		return insertResult;
	}

	
}
