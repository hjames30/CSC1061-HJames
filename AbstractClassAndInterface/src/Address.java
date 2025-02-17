
public class Address {
	private String line1;
	private String line2;
	private String city;
	private String state;
	private long zip;

	public Address(String line1, String line2, String city, String state, long zip) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ "]";
	}

}
