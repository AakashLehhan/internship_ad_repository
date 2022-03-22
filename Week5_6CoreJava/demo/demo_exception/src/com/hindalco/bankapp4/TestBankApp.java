package com.hindalco.bankapp4;

import com.hindalco.bankapp4.model.BankAccount;
import com.hindalco.bankapp4.model.SavingAccount;
import com.hindalco.paymentgateway.PayTM;

public class TestBankApp {

	public static void main(String[] args) {
		String msg = "";
		BankAccount account1 = new SavingAccount("Aditya", 10000, true);
		try {

			System.out.println(account1);
			double amount = 12000;

			PayTM payTm = new PayTM(account1);
			System.out.println("Pay 12000 Rs. Bill");

			payTm.checkOut(amount);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("After debit: \n" + account1);
		}

	}
}
