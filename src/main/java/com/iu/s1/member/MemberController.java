package com.iu.s1.member;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberController {

	private MemberService memberService;
	
	public MemberController() {
		
		memberService = new MemberService();
	}
	
	
	
	public void start(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("MemberController 실행");
		

		String uri = request.getRequestURI();
		
		String[] path=uri.split("/");

		System.out.println("path : "+path[3]);
		
		if(path[3].equals("memberLogin.do")) {
			System.out.println("로그인 진행");
			String value = request.getParameter("id");
			System.out.println(value);
			String pw = request.getParameter("pw");
			System.out.println(pw);
			
			
		}else if(path[3].equals("memberJoin.do")) {
			System.out.println("회원가입 진행");
			
			String method = request.getMethod();
			
			if(method.equals("POST")) {
				int result = memberService.memberJoin(request, response);
				
				if(result>0) {
					
					response.sendRedirect("../"); //메인 홈으로
					
				}else {
					
					response.sendRedirect("./"); //현재위치
				}
				
				
				
			}else {
				RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/member/memberJoin.jsp"); 
				view.forward(request, response);
			}
			
			
			
			
			
			
			
		}else if(path[3].equals("memberPage.do")){
			System.out.println("myPage진행");
		}else {
			System.out.println("그 외 나머지 진행");
		}
		
		
	}
}
