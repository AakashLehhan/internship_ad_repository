package com.hindalco.paymentgateway;

import com.hindalco.bankapp3.model.BankAccount;
import com.hindalco.bankapp3.model.IBankService;

public class PaymentGateWay implements IBankService {
	private IBankService account;
	
	private PaymentGateWay() {
		super();
	}

	public PaymentGateWay(BankAccount account) {
		super();
		this.account = account;
	}

	@Override
	public String deposit(double amount) {

		return account.deposit(amount);
	}

	@Override
	public String withdraw(double amount) {

		return account.withdraw(amount);
	}

}
