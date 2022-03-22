package demo_fileIO;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamTest {
	public static void main(String[] args) {
		try (FileInputStream f1 = new FileInputStream("employee.txt");
				FileInputStream f2 = new FileInputStream("copy_employee.txt");
				SequenceInputStream seq = new SequenceInputStream(f1, f2);
				FileWriter fw = new FileWriter("final_employee.txt")) {

			int b = seq.read();
			while (b != -1) {
				fw.write(b);
				b = seq.read();
			}
			seq.close();
			f1.close();
			f2.close();
		} catch (IOException e) {
			System.out.println("Error in IO is : " + e);
		}
	}
}