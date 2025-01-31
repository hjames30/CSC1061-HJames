
public class Employee {
	private String firstName;
	private String lastName;
	private int ssn;
	
	public Employee() {
		this.firstName="";
		this.lastName="";
		this.ssn=0;
	}
	public Employee(String firstName, String lastName, int ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public double getPaymentAmount() {
		return 0;
	}
	@Override
	public String toString() {
		return "Employee \nfirstName=" + firstName + "\n lastName=" + lastName + "\n ssn=" + ssn;
	}
	
	
}
