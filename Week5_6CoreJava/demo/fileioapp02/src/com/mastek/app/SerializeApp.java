package com.mastek.app;

import com.mastek.app.io.SerializeStudent;
import com.mastek.app.model.Student;

public class SerializeApp {

	public static void main(String[] args) {
		Student s=new Student(1, "Yasvita");
		SerializeStudent serializeStudent=new SerializeStudent();
		System.out.println(serializeStudent.writeObject(s));

	}

}
