package demo_initblock.pack3;

public class BankAccount {
private static final String TAG = "BankAccount";

private static int counter;
	
	private int accNo;
	private String accName;
	private double balance;
	//while loading a class 
	//this is the first block which will get
	//executed
	//it is called only once when class is loaded
	static{
		System.out.println(TAG+" static init start");
		counter=1000;
		System.out.println(TAG+" static init ended");
		
	}
	//before calling constructor of an object
	//its called every time an object is 
	//created
	{
		System.out.println(TAG+" init started"+counter);
		this.accNo=++counter;
		System.out.println(TAG+" init ended");
	}
	
	public BankAccount() {
		super();
		System.out.println(TAG+" constructor");
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
