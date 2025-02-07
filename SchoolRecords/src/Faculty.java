
public class Faculty extends Employee {
	String officeHours;
	String rank;
	public Faculty(String name, String adress, long phoneNumber, String emailAddress, String office, long salary,
			String dateHired, String officeHours, String rank) {
		super(name, adress, phoneNumber, emailAddress, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	
}
