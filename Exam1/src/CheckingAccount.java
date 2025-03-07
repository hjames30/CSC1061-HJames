
public class CheckingAccount extends Account {
	private double overdraftLimit;

	public CheckingAccount(int id, double balance, double annualIntresrRate, double overdraftLimit) {
		super(id, balance, annualIntresrRate);
		this.overdraftLimit = overdraftLimit;
	}
	

	public CheckingAccount(String customerName, int id, double balance, double overdraftLimit) {
		super(customerName, id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amountWithdrawn) {
		if ((0-overdraftLimit) <= (getBalance() - amountWithdrawn)) {
			setBalance(getBalance() - amountWithdrawn);
			Transaction temp = new Transaction('W', amountWithdrawn, getBalance());
			getTransactions().add(temp);
		} else {
			System.out.println("Withdraw can not be completed, overdraftlimit overreached");
		}

	}

	@Override
	public String toString() {
		return "Id=" + getId() + "\n DateCreated=" + getDateCreated() + "\n Balance="
				+ getBalance() + "\n MonthlyIntrest=" + getMonthlyIntrest() 
				+ "(in decimal form) \n overdraftLimit=" + overdraftLimit;
	}

}
