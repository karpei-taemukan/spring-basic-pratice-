package com.springProject00.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springProject00.dao.MemberDao;
import com.springProject00.dto.Member;

@Service
public class MemberService {

	@Autowired
	private MemberDao mdao;
	public int memberJoin_svc(Member member) {
		System.out.println("memberJoin_svc() 호출");
		// 1. dao - insert into members values(?,?,?,?,?);
		int insertResult = mdao.insertMember(member);
		return insertResult;
	}
	//회원 목록 조회 메소드
	public ArrayList<Member> getMemberList() {

		System.out.println("getMemberList() 호출");
		
		ArrayList<Member> mList = mdao.selectMember();
		
		
		return mList;
	}

}
