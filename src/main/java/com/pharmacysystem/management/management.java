package com.pharmacysystem.management;

import java.sql.Connection;
import java.sql.DriverManager;

public class management {
	private Connection conn=null;
	private String URL;
	private String USER;
	private String PASS;
	
	public Connection getconnection() {
		URL="jdbc:mysql://localhost:3306/pharmacysystem";
		USER="root";
		PASS="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if(conn==null) {
			conn=DriverManager.getConnection(URL,USER,PASS);
			return conn;
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	 

}
