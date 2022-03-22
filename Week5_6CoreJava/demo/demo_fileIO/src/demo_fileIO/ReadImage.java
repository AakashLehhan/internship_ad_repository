package demo_fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class ReadImage {
	public static void main(String[] args) {
		try {
			File file=new File("grattitude.jpg");
			if(file.exists()) {

				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("copy1.jpg");
//				int i = fis.read();
//				while (i != -1) {
//					fos.write(i);
//					i = fis.read();
//				}
				
				byte [] buffer=new byte[100];
				while(fis.read(buffer)!=-1) {
					fos.write(buffer);
				}
			}else {
				System.out.println("not found");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}