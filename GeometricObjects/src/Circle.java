
public class Circle extends GeometricObjects {
	private double radius = 1.0;

	public Circle() {

	}

	public Circle(String color, boolean isFilled, double radius) {
		super(color, isFilled);
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (radius * radius * getPIValue());
	}

	private double getPIValue() {
		return Math.PI;
	}

	public boolean equals(Object o) {
		// have to declare downcast before comparing!!!
		if (o instanceof Circle) {
			if (this.radius == ((Circle) o).radius) {
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Color=" + getColor() + ", Filled=" + isFilled() + ", Date=" + getDate();
	}

}
