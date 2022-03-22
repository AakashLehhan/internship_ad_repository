package com.mastek.app;

import com.mastek.app.io.DeserializeStudent;
import com.mastek.app.model.Student;

public class DeserializeApp {

	public static void main(String[] args) {

		DeserializeStudent ds=new DeserializeStudent();
		Student s=ds.readObject();
		System.out.println(s);
	}

}
