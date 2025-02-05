
public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, int ssn, double weeklySalary) {
		super(firstName, lastName, ssn);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getSsn()="
				+ getSsn() + ", paymentAmount=" + weeklySalary + "]";
	}

	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}

}
