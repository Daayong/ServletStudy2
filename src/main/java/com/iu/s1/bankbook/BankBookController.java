package com.iu.s1.bankbook;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BankBookController {

	private BankBookDAO bankBookDAO;
	
	public BankBookController() {
		bankBookDAO = new BankBookDAO();
	}
	
	
	public void start(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BankBookController 실행");
		
		String uri = request.getRequestURI();
		
		String[] path=uri.split("/");

		System.out.println("path : "+path[3]);
		
		if(path[3].equals("bankbookList.do")) {
			System.out.println("상품목록 조회");
			
			ArrayList<BankBookDTO> ar=bankBookDAO.getList();
			
			//for(초기식; 조건식; 증감식;) 
			//for(모은 타입 변수명 : 컬렉션 참조 변수명)  : 향상된 for 문 
			for(BankBookDTO bankBookDTO : ar) {
				System.out.println(bankBookDTO.getBookName());
			}
			
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookList.jsp");
			try {
				view.forward(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}else if(path[3].equals("bankbookInsert.do")) {
			System.out.println("상품등록 조회");
		}else if(path[3].equals("bankbookSelect.do")){
			System.out.println("상품 상세 조회");
			String num=request.getParameter("bookNumber");
			System.out.println(num+num);
			long num2=Long.parseLong(num);
			
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookNumber(num2);
			bankBookDTO =bankBookDAO.getSelect(bankBookDTO);
			
			System.out.println(bankBookDTO.getBookName());
			
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookSelect.jsp");
			try {
				view.forward(request, response);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}else {
			System.out.println("그 외 나머지 진행");
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
