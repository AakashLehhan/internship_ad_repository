package com.hindalco.bankapp2;

import com.hindalco.bankapp2.model.BankAccount;
import com.hindalco.bankapp2.model.CurrentAccount;
import com.hindalco.bankapp2.model.SavingAccount;

public class TestBankApp {

	public static void main(String[] args) {
//		BankAccount  account=new BankAccount(1000,"Aditya",2222);
		String msg="";
		BankAccount account1=new SavingAccount("Aditya", 10000, true);
		System.out.println("before withdraw 50000 "+account1);
		msg=account1.withdraw(50000);
		System.out.println(msg);
		System.out.println("After withdraw 5000 "+account1);
		BankAccount account2=new CurrentAccount("Aditya", 50000,0.1f, false);
		System.out.println("before withdraw 50000 "+account2);
		msg=account2.withdraw(50000);
		System.out.println(msg);
		System.out.println("After withdraw 5000 "+account2);
	}

}
