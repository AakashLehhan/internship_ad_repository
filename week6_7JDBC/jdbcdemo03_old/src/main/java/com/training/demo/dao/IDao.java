package com.training.demo.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao<T> {

	List<T> findAll() throws SQLException;
	T FindOne(int id)throws SQLException;
	boolean update(T t)throws SQLException;
	boolean delete(T t)throws SQLException;
	boolean insert(T t)throws SQLException;
}
