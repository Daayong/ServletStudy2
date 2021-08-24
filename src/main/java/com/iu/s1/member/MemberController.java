package com.iu.s1.member;

import javax.servlet.http.HttpServletRequest;

public class MemberController {

	
	public MemberController() {
		
		
	}
	
	
	
	public void start(HttpServletRequest request) {
		
		System.out.println("MemberController 실행");
		

		String uri = request.getRequestURI();
		
		String[] path=uri.split("/");

		System.out.println("path : "+path[3]);
		
		if(path[3].equals("memberLogin.do")) {
			System.out.println("로그인 진행");
			String value = request.getParameter("id");
			System.out.println(value);
			String value2 = request.getParameter("pw");
			System.out.println(value2);
			
			
		}else if(path[3].equals("memberJoin.do")) {
			System.out.println("회원가입 진행");
		}else if(path[3].equals("memberPage.do")){
			System.out.println("myPage진행");
		}else {
			System.out.println("그 외 나머지 진행");
		}
		
		
	}
}
