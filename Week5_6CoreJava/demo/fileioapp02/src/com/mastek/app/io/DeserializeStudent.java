package com.mastek.app.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.mastek.app.model.Student;

public class DeserializeStudent {

	public Student readObject() {
		Student s = null;
		try {
			FileInputStream fis = new FileInputStream("student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			s = (Student) ois.readObject();

			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return s;
	}
}
