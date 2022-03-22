package com.mastek;

import java.io.File;
import java.io.FileFilter;

public class App04 {

	public static void main(String[] args) {
		File dir=new File("d:\\temp");
		FileFilter filter=(File file)->{
			return file.getName().endsWith(".java");
					};
		File [] files=dir.listFiles(filter);
		for(File file:files) {
			System.out.println(file);
		}
					

	}

}
