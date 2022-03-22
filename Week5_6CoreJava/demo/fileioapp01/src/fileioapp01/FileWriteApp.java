package fileioapp01;

import java.io.FileOutputStream;

public class FileWriteApp {

	public static void main(String[] args) {
		try {
//			FileOutputStream fout = new FileOutputStream("testout.txt");
//			To append data pass boolean flag true
			FileOutputStream fout = new FileOutputStream("testout.txt",true);
			fout.write(65);//ASCII code for A
//			fout.write("\nWelcome to Fileoutputstream");//fos is bytestream
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
