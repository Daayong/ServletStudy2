package com.iu.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnector {

	public Connection getConnect() {
		
		String user = "user02";
		String password ="user02";
		String url = "jdbc:oracle:thin:@127.0.01:1521:xe";
		String driver ="oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return con;
		
	}
	
	
	
	
}