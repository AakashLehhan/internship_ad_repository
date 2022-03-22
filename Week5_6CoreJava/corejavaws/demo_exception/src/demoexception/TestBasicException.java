package demoexception;

import java.util.Scanner;

public class TestBasicException {

	public static void main(String[] args) {
		 try {
			Scanner scanner=new Scanner(System.in);
			 System.out.println("num1 :");
			 int num1=Integer.parseInt(scanner.nextLine());
			 System.out.println("num2 :");
			 int num2=Integer.parseInt(scanner.nextLine());
			 System.out.println(num1/num2);
			 scanner.close();
		}
		 catch (NumberFormatException e) {
			e.printStackTrace();
		}
		 finally{
			 System.out.println("Main completed ");
		 }
	}
}
