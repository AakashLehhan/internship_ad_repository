package com.training.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		final String url="jdbc:oracle:thin:@//localhost:1521/xe";
		final String user="c##aduser";
		final String password="root";
		
		try {
			final Connection connection=DriverManager.getConnection(url, user, password);
			if(connection!=null){
				if(!connection.isClosed()){
					System.out.println("Connected to db....");
				}
			}
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getErrorCode()+" "+e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception "+e.getMessage());
		} 
		

	}

}
