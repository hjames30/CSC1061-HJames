
public class Faculty extends Employee {
	String officeHours;
	String rank;
	public Faculty(String name, String adress, String phoneNumber, String emailAddress, String office, String salary,
			String dateHired, String officeHours, String rank) {
		super(name, adress, phoneNumber, emailAddress, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
}
