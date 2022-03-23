package com.training.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnecction {
	private static final String url = "jdbc:oracle:thin:@//localhost:1521/xe";
	private static final String user = "c##aduser";
	private static final String password = "root";
	private static Connection connection;

	private MyConnecction() {
		super();
	}

	public static Connection getConnection() {
		if(connection==null){
			try {
				connection = DriverManager.getConnection(url, user, password);
				if (connection != null) {
					if (!connection.isClosed()) {
						System.out.println("Connected to db....");
					}
				}

			} catch (SQLException e) {
				System.out.println(e.getErrorCode() + " " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Exception " + e.getMessage());
			}
		}
		return connection;
	}
}
