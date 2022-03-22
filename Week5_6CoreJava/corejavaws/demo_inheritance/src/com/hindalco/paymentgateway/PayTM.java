package com.hindalco.paymentgateway;

import com.hindalco.bankapp3.model.IBankService;

public class PayTM {
	private IBankService account;

	private PayTM() {
		super();
	}

	public PayTM(IBankService account) {
		super();
		this.account = account;
	}
	

	public String refund(double amount) {

		return account.deposit(amount);
	}

	
	public String checkOut(double amount) {

		return account.withdraw(amount);
	}
	
}
