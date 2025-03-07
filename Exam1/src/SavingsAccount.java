
public class SavingsAccount extends Account {
	private double minBalance;
	
	public SavingsAccount(int id, double balance, double annualIntresrRate, double minBalance) {
		super(id, balance, annualIntresrRate);
		this.minBalance=minBalance;
	}

	@Override
	public void withdraw(double amountWithdrawn) {
		if (minBalance >= (getBalance() - amountWithdrawn)) {
			setBalance(getBalance() - amountWithdrawn);
			Transaction temp = new Transaction('W', amountWithdrawn, getBalance());
			getTransactions().add(temp);
		} else {
			System.out.println("Withdraw can not be completed, withdraw succceds min balance");
		}
	}

	@Override
	public String toString() {
		return "Id=" + getId() + "\n DateCreated=" + getDateCreated() + "\n Balance="
				+ getBalance() + "\n MonthlyIntrest()=" + getMonthlyIntrest()+"(in decimal form)";
	}
}
