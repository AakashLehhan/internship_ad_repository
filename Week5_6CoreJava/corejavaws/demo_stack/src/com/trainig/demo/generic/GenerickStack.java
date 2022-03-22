package com.trainig.demo.generic;

import java.util.ArrayList;

import com.trainig.demo.Book;

public class GenerickStack<AnyType> {

	private final ArrayList<AnyType> arrayList=new ArrayList<>();

	public GenerickStack() {
		super();	
	}

	public ArrayList<AnyType> getArrayList() {
		return arrayList;
	}

	public boolean push(AnyType anyType){
		return arrayList.add(anyType);
	}
	
	public AnyType pop(){
		final int index=arrayList.size()-1;
		return arrayList.remove(index);
	}
	
	public AnyType peek(){
		final int index=arrayList.size()-1;
		return arrayList.get(index);
	}
}
