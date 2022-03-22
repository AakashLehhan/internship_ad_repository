package com.mastek;

import java.io.File;
import java.io.FileFilter;

public class App03 {

	public static void main(String[] args) {
		File dir=new File("D:\\temp");
		System.out.println("########### .java filter");
		
		FileFilter filter=(File file) ->file.getName().endsWith(".java");		
		applyFilter(dir, filter);
		
		System.out.println("########### .class filter");
		
		filter=(File file) ->file.getName().endsWith(".class");		
		applyFilter(dir, filter);
		

	}

	private static void applyFilter(File dir, FileFilter filter) {
		File [] files=dir.listFiles(filter);
		for(File file : files) {
			System.out.println(file);
		}
	}

}
