package com.xworks.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mobile {

	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/mobile";
		String username="root";
		String password="root";
		
		//make connection 
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(url,username,password);
		
		if(connection!=null) {
			System.out.println("connected");
		}else {
			System.out.println(" not connected");
		}}
		 catch (SQLException e) {

				e.printStackTrace();

		

	}

	}}
