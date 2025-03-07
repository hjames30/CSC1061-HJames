import java.time.LocalDate;

public class Transaction {

	private LocalDate localDate;
	private char type;
	private double amount;
	private double balance;

	@SuppressWarnings("static-access")
	public Transaction(char type, double amount, double balance) {
		localDate = localDate.now();
		this.type = type;
		this.amount = amount;
		this.balance = balance;

	}

	@Override
	public String toString() {
		return "localDate=" + localDate +
				"\n type=" + type +
				"\n amount=" + amount+
				"\n balance=" + balance;
	}
}
