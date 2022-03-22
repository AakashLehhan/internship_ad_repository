package com.hindalco.bankapp4.model;

import com.hindalco.bankapp4.util.InsufficientBalanceException;

public class CurrentAccount extends BankAccount {

	private float over_draft_percent;
	private boolean is_over_drafted;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accName, double balance, float over_draft_percent, boolean is_over_drafted) {
		super(accName, balance);
		this.over_draft_percent = over_draft_percent;
		this.is_over_drafted = is_over_drafted;
	}

	public CurrentAccount(int accNo, String accName, double balance, float over_draft_percent,
			boolean is_over_drafted) {
		super(accNo, accName, balance);
		this.over_draft_percent = over_draft_percent;
		this.is_over_drafted = is_over_drafted;
	}

	public float getOver_draft_percent() {
		return over_draft_percent;
	}

	public void setOver_draft_percent(float over_draft_percent) {
		this.over_draft_percent = over_draft_percent;
	}

	public boolean isIs_over_drafted() {
		return is_over_drafted;
	}

	public void setIs_over_drafted(boolean is_over_drafted) {
		this.is_over_drafted = is_over_drafted;
	}

	@Override
	public String deposit(double amount) {
		this.balance=this.balance+amount;
		return amount+"Credited";
	}
	// account 10000+10000*0.01->11000
	@Override
	public String withdraw(double amount)
			throws InsufficientBalanceException {

		double total_limit = balance + balance * over_draft_percent;
		if (total_limit > amount) {
			this.balance = this.balance - amount;

			return amount + " is debited. Available balance is : " + this.balance;
		}
		throw new InsufficientBalanceException("Insufficient balance");
		//return "Insufficient balance";
	}
}
