import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualIntrestRate = 0;
	private LocalDate dateCreated;
	private String customerName;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

	public Account() {
		this.dateCreated = LocalDate.now();
	}

	public Account(int id, double balance, double annualIntresrRate) {
		this.id = id;
		this.balance = balance;
		this.annualIntrestRate = annualIntresrRate;
		this.dateCreated = LocalDate.now();
	}
	public Account(String customerName, int id, double balance) {
		this.customerName=customerName;
		this.id=id;
		this.balance=balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualIntrestRate() {
		return annualIntrestRate;
	}

	public void setAnnualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}
	//returns back as a decimal not as a percentage
	public double getMonthlyIntrestRate() {
		return (annualIntrestRate/100) / 12;
	}

	public double getMonthlyIntrest() {
		return balance * (getMonthlyIntrestRate() / 100);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}


	public void withdraw(double amountWithdrawn) {
		balance = balance - amountWithdrawn;
		Transaction temp = new Transaction('W', amountWithdrawn, balance);
		transactions.add(temp);
	}

	public void depostit(double amountDepostited) {
		balance = balance + amountDepostited;
		Transaction temp = new Transaction('D', amountDepostited, balance);
		transactions.add(temp);
	}
}
