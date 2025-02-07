
public class Staff extends Employee {
	String dataMember;

	public Staff(String name, String adress, long phoneNumber, String emailAddress, String office, long salary,
			String dateHired, String dataMember) {
		super(name, adress, phoneNumber, emailAddress, office, salary, dateHired);
		this.dataMember = dataMember;
	}
	
	
}
