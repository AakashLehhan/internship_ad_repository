package fileioapp01;

import java.io.FileWriter;

public class FileWriterApp {

	public static void main(String[] args) {
		 try{    
	           FileWriter fw=new FileWriter("testwriter.txt");    
	           fw.write("Welcome to javaTpoint.");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	}

}
