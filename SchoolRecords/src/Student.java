
public class Student extends Person {
	private String status;

	public Student(String name, String adress, long phoneNumber, String emailAddress, String status) {
		super(name, adress, phoneNumber, emailAddress);
		this.status = status;
	}
	
	
}
