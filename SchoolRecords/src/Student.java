
public class Student extends Person {
	private String status;

	public Student(String name, String adress, String phoneNumber, String emailAddress, String status) {
		super(name, adress, phoneNumber, emailAddress);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [getName()=" + getName() + ", getAdress()=" + getAdress() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getEmailAddress()=" + getEmailAddress() + ", status=" + status + "]";
	}
	
	
}
