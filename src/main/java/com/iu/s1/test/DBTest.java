package com.iu.s1.test;

import com.iu.s1.bankbook.BankBookDAO;
import com.iu.s1.bankbook.BankBookDTO;


public class DBTest {

	public static void main(String[] args) {
		// Test
		
	
		//BankBookDAO getSelect Test 
		
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO bankBookDTO = new BankBookDTO();
		
		bankBookDTO.setBookNumber(3);
		bankBookDTO=bankBookDAO.getSelect(bankBookDTO);
		
		System.out.println(bankBookDTO.getBookName());
		
	

	}

}
