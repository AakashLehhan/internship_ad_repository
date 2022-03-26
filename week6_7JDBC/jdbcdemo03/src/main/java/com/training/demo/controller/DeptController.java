package com.training.demo.controller;

import java.sql.SQLException;
import java.util.List;

import com.training.demo.dao.DeptDao;
import com.training.demo.model.Dept;

public class DeptController {

	private DeptDao dao;

	public DeptController() {
		super();
		this.dao = new DeptDao();
	}

	public List<Dept> findAll() throws SQLException {
		return dao.findAll();
	}

	public Dept FindOne(int id) throws SQLException {
		return dao.FindOne(id);
	}

	public boolean update(Dept dept) throws SQLException {
		return dao.update(dept);
	}

	public boolean delete(Dept dept) throws SQLException {
		return dao.delete(dept);
	}

	public boolean create(Dept dept) throws SQLException {
		return dao.create(dept);
	}
}
