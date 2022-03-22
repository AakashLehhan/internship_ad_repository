package com.hindalco.paymentgateway;

import com.hindalco.bankapp4.model.IBankService;

public class PayTM {
	private IBankService account;

	private PayTM() {
		super();
	}

	public PayTM(IBankService account) {
		super();
		this.account = account;
	}
	

	public String refund(double amount) throws Exception {

		return account.deposit(amount);
	}

	
	public String checkOut(double amount) throws Exception {

		return account.withdraw(amount);
	}
	
}
