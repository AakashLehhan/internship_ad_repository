package demo_initblock.pack1;

public class BankAccount {
	private static int counter=0;
	private int accNo;
	private String accName;
	private double balance;
	//init block
	//no-named block
	//used to initialize object data 
	//it's called by jvm whenever an object is created
	{
		System.out.println("init block called");
		this.accNo=++counter;
		System.out.println("init block ended");
	}
	
	public BankAccount() {
		super();
		System.out.println("constructor called");
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

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}
	
	
	
}
