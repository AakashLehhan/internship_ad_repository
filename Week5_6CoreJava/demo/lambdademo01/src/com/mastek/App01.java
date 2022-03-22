package com.mastek;

import java.io.File;
import java.io.FileFilter;

public class App01 {

	public static void main(String[] args) {
		File dir=new File("D:\\temp");
		
		FileFilter fileFilter=new JavaFileFilter();		
		applyFilter(dir, fileFilter);
		
		fileFilter=new CustomFilter("class");
		applyFilter(dir, fileFilter);
		
		fileFilter=new CustomFilter("java");
		applyFilter(dir, fileFilter);
		
	}

	private static void applyFilter(File dir, FileFilter fileFilter) {
		File [] files=dir.listFiles(fileFilter);
		for(File file : files) {
			System.out.println(file);
		}
	}

}

class CustomFilter implements FileFilter{

	private String filterValue;
	public CustomFilter() {
		super();
	}
	

	public CustomFilter(String filterValue) {
		super();
		this.filterValue = filterValue;
	}


	@Override
	public boolean accept(File pathname) {
	
		return pathname.getName().endsWith("."+this.filterValue);
	}
	
}
class JavaFileFilter implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		
		return pathname.getName().endsWith(".java");
	}
	
}