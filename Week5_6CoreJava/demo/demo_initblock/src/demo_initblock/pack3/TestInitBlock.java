package demo_initblock.pack3;

public class TestInitBlock {

	public static void main(String[] args) {
		BankAccount ba1 = new SavingAccount();
		ba1.setAccName("Sarfraz");
		ba1.setBalance(1000000.00);
		
		BankAccount ba2 = new SavingAccount();
		ba2.setAccName("Swapnil");
		ba2.setBalance(1000000.00);
		
		BankAccount ba3 = new SavingAccount();
		ba3.setAccName("Madhukar");
		ba3.setBalance(1000000.00);
		
		System.out.println(ba1);
		System.out.println(ba2);
		System.out.println(ba3);
	}

}
