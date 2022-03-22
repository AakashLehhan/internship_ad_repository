package com.mastek;

import java.io.File;
import java.io.FileFilter;

public class App02 {

	public static void main(String[] args) {
//		uses of anonymous class
		FileFilter filter=new FileFilter() {			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		};
		File dir=new  File("d:\\temp");
		File [] files=dir.listFiles(filter);
		for(File file: files) {
			System.out.println(file);
			
		}

	}

}
