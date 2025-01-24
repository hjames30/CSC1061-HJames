
public class Car {
	//Data members
	private String color = "Green";
	private int mileage= 200;
	private double amountOfGas = 10;
	private boolean isClean;
	
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
	public Car(int umileage, String color) {
		this.mileage=umileage;
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		
		this.color = color;
		if(this.color.equals("Platnium")) {
			System.out.println("Illegal paint");
		}
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public double getAmountOfGas() {
		return amountOfGas;
	}
	public void setAmountOfGas(double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}
	public boolean isClean() {
		return isClean;
	}
	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", mileage=" + mileage + ", amountOfGas=" + amountOfGas + ", isClean=" + isClean
				+ "]";
	}
	
}
