package com.training.demo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.demo.model.Dept;

public class DeptDao implements IDao<Dept>{
	private static final Connection connection;
	private static final ArrayList<Dept> departments=new ArrayList<Dept>();
	static{
		connection=MyConnection.getConnection();
	}
	
	public DeptDao() {
		super();
		
	}

	public List<Dept> findAll() throws SQLException {
		final String sql = "select deptno,dname from dept";
		final Statement statementSelect = connection.createStatement();
		final ResultSet resultSet = statementSelect.executeQuery(sql);
		while (resultSet.next()) {
			Dept dept=new Dept(resultSet.getInt("deptno"),resultSet.getString("dname"),resultSet.getInt("branchno"));
			departments.add(dept);
		}
		resultSet.close();
		statementSelect.close();

		return departments;
	}

	public Dept FindOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(Dept t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Dept t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean insert(Dept t) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
