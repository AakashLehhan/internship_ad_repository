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
		departments.clear();
		final String sql = "select deptno,dname,branchno from dept";
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

	public Dept FindOne(int id) throws SQLException{
		final String sql = "select deptno,dname,branchno from dept where deptno="+id;
		final Statement statementSelect = connection.createStatement();
		final ResultSet resultSet = statementSelect.executeQuery(sql);
		Dept dept=null;
		while (resultSet.next()) {
			dept=new Dept(resultSet.getInt("deptno"),resultSet.getString("dname"),resultSet.getInt("branchno"));	
		}
		resultSet.close();
		statementSelect.close();
		return dept;
	}

	public boolean update(Dept t) throws SQLException {
		final String sql = "update dept set dname='"+t.getDname()+"' where deptno="+t.getDeptno();
		final Statement statementSelect = connection.createStatement();
		
		final int noOfRecords=statementSelect.executeUpdate(sql);		
		statementSelect.close();
		
		return noOfRecords>0?true: false;
	}

	public boolean delete(Dept t) throws SQLException {
		final String sql = "delete from dept where deptno="+t.getDeptno();
		final Statement statementSelect = connection.createStatement();
		
		final int noOfRecords=statementSelect.executeUpdate(sql);		
		statementSelect.close();
		
		return noOfRecords>0?true: false;
	}

	public boolean create(Dept t) throws SQLException {
		final String sql ="insert into dept values("+t.getDeptno()
													+",'"
													+t.getDname()
													+"',"
													+t.getBranchno()
													+")";
		final Statement statementSelect = connection.createStatement();
		
		final int noOfRecords=statementSelect.executeUpdate(sql);		
		statementSelect.close();
		
		return noOfRecords>0?true: false;	}

	
}
