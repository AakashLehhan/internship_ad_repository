package com.hindalco.bankapp4.model;


public  abstract class BankAccount implements Comparable<BankAccount>,IBankService{


	private static int counter=1000;
	private int accNo;
	private String accName;
	protected double balance;
	
	{
		this.accNo=++counter;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	public BankAccount(String accName, double balance) {
		super();
		this.accName = accName;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static int getCounter() {
		return counter;
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}
	@Override
	public int compareTo(BankAccount account) {
		return this.getAccNo()-account.getAccNo();
	}

	
//	public String deposit(double amount) {
//		this.balance=this.balance+amount;
//		return amount+"Credited";
//	}
	
//	public String withdraw(double amount) {
//		if((balance-amount)>=0) {
//			this.balance=this.balance-amount;
//			return amount+" debited";
//		}
//		return "Insufficient balance";
//		
//	}
	
}












