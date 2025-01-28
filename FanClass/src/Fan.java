
public class Fan {
	// constants
	static int slow = 1;
	static int medium = 2;
	static int fast = 3;
	private static int id = 0;
	// default data member
	private int speed = slow;
	private boolean isOn = false;
	private double radius = 5;
	private String color = "blue";

	// default conc with no arg
	public Fan() {

	}

	// user input fan
	public Fan(int speed, boolean isOn, double radius, String color) {
		id++;
		this.speed = speed;
		this.isOn = isOn;
		this.radius = radius;
		this.color = color;
	}

	public Fan(int speed) {
		this.speed = speed;
	}

	// getters/setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Fan.id = id;
	}

	// toString()
	public String toString(boolean userIsOn) {
		if (isOn == true) {
			return "id =" + id + " speed = " + speed + " color = " + color + " radius = " + radius;
		} else {
			return "id =" + id + " speed = " + speed + " color = " + color + " radius = " + radius + " fan is off";
		}

	}

}
