package com.mastek.app.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import com.mastek.app.model.Student;

public class DeserializeList {

	public List<Student> readObject() {
		List<Student> list = null;
		try {
			FileInputStream fis = new FileInputStream("students.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			list = (List<Student>) ois.readObject();

			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
			return list;
		}

		return list;
	}
}
