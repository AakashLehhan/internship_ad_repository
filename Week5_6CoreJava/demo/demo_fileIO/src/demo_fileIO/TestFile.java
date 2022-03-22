package demo_fileIO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {
//		File f = new File("employee.txt");//program reference
		File f=null;
		File directory=new File("com/resource");
//		System.out.println("Does the file exists ? " + f.exists());
		try {
			//f.createNewFile();// Creae new file if not exist
			//create a directory
			directory.mkdirs();
			f=new File("com/resource","employee.txt");
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("After createNew() Does the file exists ? " + f.exists());
		System.out.println("Is this a file ? " + f.isFile());
		System.out.println("Is this a directory ? " + directory.isDirectory());
		System.out.println("The AbsolutePath is :" + f.getAbsolutePath());
		System.out.println("The file separator : " + f.separator);
		System.out.println("The size of file : " + f.length());
		System.out.println("The file was last modified at : " + new Date(f.lastModified()));
		System.out.println("Is the file Readable ? " + f.canRead());
		System.out.println("Is the file Writable ? " + f.canWrite());
		System.out.println("Is the file Hidden ? " + f.isHidden());
	}

}
