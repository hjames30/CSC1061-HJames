
public class driver {

	public static void main(String[] args) {
		// part 1 checking account check
		System.out.println("Part 1 \n Checking account check");
		CheckingAccount myCheckAcct = new CheckingAccount(1111, 2000, 0.5, 200);
		myCheckAcct.withdraw(2100);
		myCheckAcct.depostit(3000);
		System.out.println(myCheckAcct.toString());
		// part 1 savings account check
		System.out.println("Savings account check");
		SavingsAccount mySaveAcct = new SavingsAccount(1100, 500, 1.0, 200);
		mySaveAcct.withdraw(300);
		System.out.println(mySaveAcct.toString());

		// part 2 after modifying account
		System.out.println("Part 2");
		CheckingAccount partTwoMyCheckingAcct = new CheckingAccount("George", 2222, 1000, 200);
		// setting IntrestRate separately
		partTwoMyCheckingAcct.setAnnualIntrestRate(1.5);
		// methods
		partTwoMyCheckingAcct.depostit(30);
		partTwoMyCheckingAcct.depostit(40);
		partTwoMyCheckingAcct.depostit(50);
		partTwoMyCheckingAcct.withdraw(5);
		partTwoMyCheckingAcct.withdraw(4);
		partTwoMyCheckingAcct.withdraw(2);
		// printing account summary
		partTwoMyCheckingAcct.toString();
		// printing all transactions
		System.out.println(" \n Printing all transactions");
		System.out.println(partTwoMyCheckingAcct.getTransactions().toString());
	}
}
