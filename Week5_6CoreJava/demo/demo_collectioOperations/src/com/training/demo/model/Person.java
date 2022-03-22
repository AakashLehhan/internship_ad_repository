package com.training.demo.model;

public class Person {

	private int pid;
	private String pname;
	private int age;
	
	private static int counter;
	static{counter=1001;}
	{this.pid=counter++;}
	
	public Person() {
		super();

	}
	public Person(int pid, String pname, int age) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
	}
	public Person(String pname, int age) {
		super();
		this.pname = pname;
		this.age = age;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pid;
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
		Person other = (Person) obj;
		if (pid != other.pid)
			return false;
		return true;
	}
	
}
