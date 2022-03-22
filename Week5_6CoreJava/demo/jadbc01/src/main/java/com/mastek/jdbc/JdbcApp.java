package com.mastek.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JdbcApp {

	public static void main(String[] args) {
		try {
			//1. registre driver
			Class driver=Class.forName("com.mysql.cj.jdbc.Driver");//Java Reflection API
			//2. create connection
			final String user="root";
			final String password="root";
			final String url="jdbc:mysql://localhost:3306/dbjul21";
			final Connection connection=DriverManager.getConnection(url,user,password);
			//3. create statement
			final Statement statement=connection.createStatement();
			final String select="select * from dept";
			//4. execute statement
			final ResultSet resultSet=statement.executeQuery(select);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("deptno")+"  "
									+resultSet.getString("dname")+"  "
									+resultSet.getString("loc")
						);
			}
			//5. close connection 
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
