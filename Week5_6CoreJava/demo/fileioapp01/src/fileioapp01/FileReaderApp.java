package fileioapp01;

import java.io.FileReader;

public class FileReaderApp {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("testwriter.txt");
			int i;
			while ((i = fr.read()) != -1)
				System.out.print((char) i);
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
