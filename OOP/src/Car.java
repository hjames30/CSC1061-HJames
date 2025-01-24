
public class Car {
	//Data members
	private String color;
	private int mileage;
	private double amountOfGas;
	private boolean isClean =true;
	
	//no arg conc 
	public Car() {
		color = "grey";
		mileage = 10;
		amountOfGas = 2.0;
		isClean = true;
	}
	public Car(String color, int mileage) {
		this.color = color;
		this.mileage=mileage;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", mileage=" + mileage + ", amountOfGas=" + amountOfGas + ", isClean=" + isClean
				+ "]";
	}
	
}
