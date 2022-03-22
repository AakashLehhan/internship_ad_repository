package com.hindalco.bankapp3;


import com.hindalco.bankapp3.model.CurrentAccount;
import com.hindalco.bankapp3.model.SavingAccount;
import com.hindalco.paymentgateway.PayTM;
import com.hindalco.paymentgateway.PaymentGateWay;
import com.hindalco.bankapp3.model.BankAccount;

public class TestBankApp {

	public static void main(String[] args) {
		String msg="";
		BankAccount account1=new SavingAccount("Aditya", 10000, true);
		System.out.println(account1);
		double amount=1000;
//		PaymentGateWay checkOut=new PaymentGateWay(account1);
//		System.out.println("Pay 1000 Rs. Bill");
//		
//		checkOut.withdraw(amount);
//		System.out.println("After debit: \n"+account1);
//		System.out.println("Payment failed . amount will be creadited in your"
//				+ " account in 48hrs");
//		checkOut.deposit(amount);
//		
//		System.out.println("After Credit: \n"+account1);
		
		PayTM payTm=new PayTM(account1);
		System.out.println("Pay 1000 Rs. Bill");		
		payTm.checkOut(amount);
		System.out.println("After debit: \n"+account1);
		
		System.out.println("Payment failed . amount will be "
				+ "creadited in your"
				+ " account in 48hrs");
		payTm.refund(amount);
		System.out.println("After Credit: \n"+account1);
	}

}
