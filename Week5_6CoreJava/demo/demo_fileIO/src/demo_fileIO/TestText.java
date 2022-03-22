package demo_fileIO;

import java.io.FileReader;
import java.io.FileWriter;

public class TestText {

	public static void main(String[] args) {
		int i=0;
		try(FileReader fr = new FileReader ("employee.txt");
				FileWriter fw= new FileWriter("copy_employee.txt")
						) {
			char [] data=new char[100];
			while(fr.read(data)!=-1) {
				fw.write(data);
			}
			
		} catch (Exception e) {
				e.printStackTrace();
		}

	}

}
