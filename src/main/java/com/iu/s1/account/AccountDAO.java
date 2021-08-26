package com.iu.s1.account;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class AccountDAO {

	private DBConnector dbConnector;
	
	public AccountDAO() {
		
		dbConnector = new DBConnector();
		
	}
	
	
	public ArrayList<AccountDTO> getList() {
		Connection con = dbConnector.getConnect();
		PreparedStatement st = null;
		ResultSet rs = null; 
		
		ArrayList<AccountDTO> ar = new ArrayList<AccountDTO>(); 
		
		String sql = "SELECT * FROM ACCOUNT";
		
		try {
			st = con.prepareStatement(sql);
			rs = st.executeQuery();
			
			while(rs.next()) {
				AccountDTO accountDTO = new AccountDTO();
				accountDTO.setAccountNumber(rs.getLong("accountNumber"));
				accountDTO.setId(rs.getString("id"));
				accountDTO.setBookNumber(rs.getLong("bookNumber"));
				accountDTO.setAccountDate(rs.getDate("accountDate"));
				accountDTO.setAccountBalance(rs.getLong("accountBalance"));
				ar.add(accountDTO);
				
				
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return ar;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
