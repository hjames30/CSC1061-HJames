
public class Rectangle extends GeometricObjects {
	private double width;
	private double height;
	
	public Rectangle() {
		super();
		width = 1.0;
		height = 2.0;
		super.setColor("Black");
		super.setFilled(true);
	}

	public Rectangle(String color, boolean isFilled, double width, double height) {
		super(color, isFilled);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return height*width;
	}
	public double getPerimeter() {
		return (2*height)+(2*width);
	}
	public double scaledArea(int scale) {
		return height*width*scale;
	}
	@Override
	public String toString() {
		return "Rectangle:"+" Color()=" + getColor() + ", Filled()=" + isFilled() + ", Date()=" + getDate()
				+ ", width=" + width + ", height=" + height + "";
	}
	
	

}
