package demo_initblock.pack3;

public class SavingAccount extends BankAccount {
	private static final String TAG = "SavingAccount";
	
	private static final double MIN_BAL;
	
	static {
		System.out.println(TAG+" STATIC BLOCK CALLED");
		MIN_BAL=1000.00;
		System.out.println(TAG+" STATIC BLOCK ENDED");
	}
	{
		System.out.println(TAG+" init BLOCK CALLED");
		
		System.out.println(TAG+" init BLOCK ENDED");
	}
	
	public SavingAccount() {
		super();
		System.out.println(TAG+"constructor");
	}

	@Override
	public String toString() {
//		return "SavingAccount "+getAccNo()+" "+getAccName()+" "+getBalance();
		return super.toString();
	}
	
}
