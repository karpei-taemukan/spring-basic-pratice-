package com.springProject00.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springProject00.dto.Member;

@Controller
public class MainController {

	@RequestMapping(value = "/")
	public ModelAndView mainPage() {
		System.out.println("controller - / 요청");
		
		ModelAndView mav = new ModelAndView();
		// 1. 데이터 - SERVICE 
		
		//ArrayList<Board> bList = svc.getBoardList();
		//mav.addObject("이름", 데이터);  => ModelAndView에 데이터 담기
		mav.addObject("maindata", "TESTDATA");
		
		// 2. 포워딩 - 페이지 지정
		mav.setViewName("MemberJoin");  // => ModelAndView의 페이지 지정
		
		return mav;
	}
	
	
	@RequestMapping(value="/testPage")
	public ModelAndView testPage(int testnum, @RequestParam(value="teststr") String tstr, 
	@RequestParam(value="testval", defaultValue="TEST") String testval) {
	System.out.println("/testPage 요청");
	System.out.println("testnum: "+ testnum);
	System.out.println("teststr: "+ tstr);
	System.out.println("testval: "+ testval);
	return null;
	}
	

	@RequestMapping(value="/testJoin")
	public ModelAndView testJoin(Member member) {
		System.out.println("/testJoin 요청");
		ModelAndView mav = new ModelAndView();
		// 1. 회원 가입 회원 정보 파라메터 확인 
		System.out.println(member);
		// 2. SERVICE 회원 가입 기능 호출 
		// int joinresult = msvc.memberJoin(member)
		// if(joinresult > 0) {~~~~}
		//2 회원 가입 성공 >> 메인페이지 이동 
	//	mav.setViewName("main"); // main.jsp 에 전달할 데이터가 없이 이동
		
		mav.setViewName("redirect:/");
	
		return mav;
	}
	
}
	

// Model  데이터를 주고받기 위한 객체 
// view  페이지에 관한 데이터