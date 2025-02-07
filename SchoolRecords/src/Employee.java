
public class Employee extends Person {
	private String office;
	private long salary;
	private String dateHired;
	public Employee(String name, String adress, long phoneNumber, String emailAddress, String office, long salary,
			String dateHired) {
		super(name, adress, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	
}
