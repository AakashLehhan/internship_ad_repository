package com.hindalco.bankapp1;

import com.hindalco.bankapp1.model.BankAccount;
import com.hindalco.bankapp1.model.CurrentAccount;
import com.hindalco.bankapp1.model.SavingAccount;

public class TestBankApp {

	public static void main(String[] args) {
		String msg="";
//		BankAccount ba1=new SavingAccount("Atish",50000, false);
//		System.out.println("before deposit 4000 "+ba1);
//		msg=ba1.deposit(4000);
//		System.out.println(msg);
//		System.out.println("After deposit 4000 "+ba1);
//		BankAccount ba2=new SavingAccount("Alisha",50000, true);
//		System.out.println("before withdraw 4000 "+ba2);
//		msg=ba2.withdraw(4000);
//		System.out.println(msg);
//		System.out.println("After withdraw 4000 "+ba2);
//		System.out.println("before withdraw 49100 "+ba2);
//		msg=ba2.withdraw(49100);
//		System.out.println(msg);
//		System.out.println("After withdraw 49100 "+ba2);
		BankAccount ba3=new CurrentAccount("Alisha",50000, 0.1f,false);
		System.out.println("before withdraw 50000 "+ba3);
		msg=ba3.withdraw(50000);
		System.out.println(msg);
		System.out.println("After withdraw 5000 "+ba3);
		System.out.println("before withdraw 5000 "+ba3);
		msg=ba3.withdraw(5000);
		System.out.println(msg);
		System.out.println("After withdraw 5000 "+ba3);
		
		ba3=new CurrentAccount("Alisha",50000, 0.1f,false);
		System.out.println("before withdraw 55000 "+ba3);
		msg=ba3.withdraw(55000);
		System.out.println(msg);
		System.out.println("After withdraw 55000 "+ba3);
	}

}
