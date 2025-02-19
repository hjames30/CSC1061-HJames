
public abstract class Vechicle implements Feedable {
	private String color;
	private int iD;
	

	public Vechicle(String color, int iD) {
		super();
		this.color = color;
		this.iD = iD;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getiD() {
		return iD;
	}

	

	public abstract void drive(int numMiles);

	@Override
	public String toString() {
		return "Vechicle [color=" + color + ", iD=" + iD + "]";
	}

}
