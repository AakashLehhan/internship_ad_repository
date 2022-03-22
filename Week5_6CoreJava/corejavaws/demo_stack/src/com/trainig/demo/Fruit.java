package com.trainig.demo;

public class Fruit implements Comparable<Fruit>{

	private int id;
	private String name;
	private static int counter=1001;
	{
		this.id=counter++;
	}
	public Fruit() {
		super();
	}
	public Fruit(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Fruit(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Fruit other = (Fruit) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public int compareTo(Fruit fruit) {
		
		return this.id-fruit.id;
	}
	
}
