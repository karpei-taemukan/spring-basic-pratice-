package com.springProject00.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springProject00.dto.Member;
import com.springProject00.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService msvc;
	
	@RequestMapping(value="/memberJoin")
	public ModelAndView memberJoin(Member member) {
		System.out.println("/memberJoin 요청");
		ModelAndView mav = new ModelAndView();
		System.out.println(member);
		
		// 1. service 회원가입 기능 호출
		int joinResult =  msvc.memberJoin_svc(member);
		// 2. 결과값에 따라 페이지 포워딩 -+
		if(joinResult > 0) {
			System.out.println("가입 성공");
		}
		else {
			System.out.println("가입 실패");
		}
		mav.setViewName("redirect:/");
		return mav;
	}
	
	@RequestMapping(value="/memberList")
	public ModelAndView memberList() {
	System.out.println("/memberList 요청");
	ArrayList<Member> mList = msvc.getMemberList();
	System.out.println("mList: "+ mList);
	return null;
	}		
	
	}