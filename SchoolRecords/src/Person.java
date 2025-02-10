
public class Person {
	private String name;
	private String adress;
	private String phoneNumber;
	private String emailAddress;
	
	public Person(String name, String adress, String phoneNumber2, String emailAddress) {
		super();
		this.name = name;
		this.adress = adress;
		this.phoneNumber = phoneNumber2;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
}
