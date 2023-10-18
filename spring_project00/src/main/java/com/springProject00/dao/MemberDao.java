package com.springProject00.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.springProject00.dto.Member;

public interface MemberDao { // interface: 중복될수 있는 메소드를 통일하도록 함
	
	@Insert("insert into members(mid,mpw,mname,mbirth,maddr) values(#{mid},#{mpw},#{mname},#{mbirth},#{maddr})")
	int insertMember(Member member) /*{myBatis가 수행}*/;

	@Select("select * from members")
	ArrayList<Member> selectMember();
}
