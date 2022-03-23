package com.training.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.demo.dao.MyConnecction;

public class App {

	public static void main(String[] args) {
		try {
			final Connection connection = MyConnecction.getConnection();
			// get dept table data
			getDeptData(connection);
			// insert record in dept
			insertDeptRecord(connection);
			// Delete record in dept
			deleteDeptRecord(connection);
			// update record in dept deptno=34 dname=Admin
			updateDeptRecord(connection);
			connection.close();
		} catch (SQLException e) {

			System.out.println(e.getErrorCode() + " " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void updateDeptRecord(final Connection connection) throws SQLException {
		final Statement statement = connection.createStatement();
		final String updateSql = "update dept set dname='Admin' where deptno=35";
		final int recordNo = statement.executeUpdate(updateSql);
		if (recordNo > 0) {
			System.out.println("Updated record");
		} else {
			System.out.println("Not Updated record");
		}
		statement.close();
		System.out.println("After update data is ");
		getDeptData(connection);
	}

	private static void deleteDeptRecord(final Connection connection) throws SQLException {
		final Statement statement = connection.createStatement();
		final String deleteSql = "delete from dept where deptno=34";
		final int recordNo = statement.executeUpdate(deleteSql);
		System.out.println(recordNo + " Deleted");
		System.out.println("After delete data is ");
		getDeptData(connection);

	}

	private static void insertDeptRecord(final Connection connection) throws SQLException {
		final Statement statement = connection.createStatement();
		final String insertSql = "insert into dept values(35,'FunCommitee',102)";
		final boolean result = statement.execute(insertSql);
		// execute()=>resultset or no counter =>if its not resultset then it
		// returns false
		if (result) {
			System.out.println("No record added");
		} else {
			System.out.println("New Record added ");
		}
		System.out.println("After Insert data is ");
		getDeptData(connection);
	}

	private static void getDeptData(final Connection connection) throws SQLException {
		final String sql = "select deptno,dname from dept";
		final Statement statementSelect = connection.createStatement();
		final ResultSet resultSet = statementSelect.executeQuery(sql);
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("deptno") + " ");
			System.out.println(resultSet.getString("dname"));
		}
		resultSet.close();
		statementSelect.close();
	}

}
