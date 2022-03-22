package com.mastek.app.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.mastek.app.model.Student;

public class SerializeStudent {

	public String writeObject(Student s) {
		try {
			FileOutputStream fos=new FileOutputStream("student.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(s);
			
			oos.flush();
			oos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Failed";
		}
		return "Success";
	}
}
