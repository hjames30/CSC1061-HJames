import java.util.Date;

public class GeometricObjects {
	private String color ="white";
	private boolean isFilled= false;
	private final Date dateCreated = new Date();
	
	public GeometricObjects() {
		
	}
	public GeometricObjects(String color, boolean isFilled) {
		super();
		this.color = color;
		this.isFilled = isFilled;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return isFilled;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	public Date getDate() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "GeometricObjects [color=" + color + ", Filled=" + isFilled + ", dateC=" + dateCreated + "]";
	}
	
	
	
}
