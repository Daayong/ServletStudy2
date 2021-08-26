package com.iu.s1.account;


import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AccountController {

	private AccountDAO accountDAO;
	
	//생성자 
	public AccountController() {
		accountDAO = new AccountDAO(); 
	}
	
	public void start(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AccountController 실행");
		
		String uri = request.getRequestURI();
		
		String[] path =uri.split("/");
		
		System.out.println("path :"+path[3]);
		
		if(path[3].equals("accountList.do")) {
			System.out.println("계좌목록 조회");
			ArrayList<AccountDTO> ar = accountDAO.getList();
			 
			for(AccountDTO accountDTO : ar) {
				System.out.println(accountDTO.getId());
			}
			
			
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/account/accountList.jsp");
			request.setAttribute("list", ar);
			try {
				view.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}else {
			
			System.out.println("없는 작업입니다");
			
		}
		

		
		
		
		
		
		
		
	} //start 메서드 

	
}
