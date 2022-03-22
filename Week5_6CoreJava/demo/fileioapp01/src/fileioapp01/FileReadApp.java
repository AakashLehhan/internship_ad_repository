package fileioapp01;

import java.io.FileInputStream;

public class FileReadApp {

	public static void main(String[] args) {
		try{    
            FileInputStream fin=new FileInputStream("testout.txt");
            //To read one character below is ok
//            int i=fin.read();  
//            System.out.print((char)i);  
            //To read till eof
            //0,1 only -1 is invalid
            int i=fin.read();
            while(i!=-1) {
            	System.out.print((char)i);
            	i=fin.read();
            }
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    

	}


