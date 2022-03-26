package com.training.demo.model;

import java.io.Serializable;

public class Dept implements Serializable,Comparable<Dept> {

	private int deptno;
	private String dname;
	private int branchno;
	
	private static int counter=1;
	{
		this.deptno=counter++;
	}
	public Dept() {
		super();
	
	}
	public Dept(String dname, int branchno) {
		super();
		this.dname = dname;
		this.branchno = branchno;
	}
	public Dept(int deptno, String dname, int branchno) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.branchno = branchno;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getBranchno() {
		return branchno;
	}
	public void setBranchno(int branchno) {
		this.branchno = branchno;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		if (deptno != other.deptno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", branchno=" + branchno + "]";
	}
	public int compareTo(Dept o2) {
	
		return this.getDeptno()-o2.getDeptno();
	}
	
	
	
}
