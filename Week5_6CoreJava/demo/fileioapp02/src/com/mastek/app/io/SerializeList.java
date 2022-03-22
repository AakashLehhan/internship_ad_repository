package com.mastek.app.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.mastek.app.model.Student;

public class SerializeList {

	public String writeObject(List<Student> list) {
		String message = "Failed";
		try {
			FileOutputStream fos = new FileOutputStream("students.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();
			oos.close();
			fos.close();
		} catch (Exception e) {
			return message;
		}

		return message;
	}

}
