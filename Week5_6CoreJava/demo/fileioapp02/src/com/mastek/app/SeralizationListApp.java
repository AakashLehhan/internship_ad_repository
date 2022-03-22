package com.mastek.app;

import java.util.ArrayList;
import java.util.List;

import com.mastek.app.io.DeserializeList;
import com.mastek.app.io.SerializeList;
import com.mastek.app.model.Student;

public class SeralizationListApp {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("yasvita"));
		list.add(new Student("tejas"));
		list.add(new Student("ajharali"));
		list.add(new Student("anjali"));
		SerializeList serializeList=new SerializeList();
		serializeList.writeObject(list);
		list.clear();
		list=new DeserializeList().readObject();
		list.stream().forEach(System.out::println);
		
	}

}
