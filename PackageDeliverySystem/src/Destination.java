
public class Destination {
	private String adress;
	private String city;
	private String state;
	public Destination(String adress, String city, String state) {
		super();
		this.adress = adress;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Destination is "+adress+" "+city+" "+state;
	} 
	
	
}
