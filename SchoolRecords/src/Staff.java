
public class Staff extends Employee {
	String dataMember;

	public Staff(String name, String adress, String phoneNumber, String emailAddress, String office, String salary,
			String dateHired, String dataMember) {
		super(name, adress, phoneNumber, emailAddress, office, salary, dateHired);
		this.dataMember = dataMember;
	}

	public String getDataMember() {
		return dataMember;
	}

	public void setDataMember(String dataMember) {
		this.dataMember = dataMember;
	}
	
	
}
