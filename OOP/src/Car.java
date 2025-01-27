
public class Car {
	//Data members
	private String color = "Green";
	private int mileage= 200;
	private double amountOfGas = 10;
	private boolean isClean;
	private final double mpg = 20.6;
	private Radio radio= new Radio(false, false, 0);
	private  Wheels []  wheels = new Wheels[4];
	
	
	
	//no arg conc 
	public Car() {
		color = "grey";
		mileage = 10;
		amountOfGas = 2.0;
		isClean = true;
		
	}
	public Car(String color, int mileage, double amountOfGas, boolean isClean, boolean wantRadio) {
		super();
		this.color = color;
		this.mileage = mileage;
		this.amountOfGas = amountOfGas;
		this.isClean = isClean;
		if(wantRadio) {
			Radio radio= new Radio(true, true, 0);
		}
	}
	public Car(String color, int mileage) {
		this.color = color;
		this.mileage=mileage;
	}
	public Car(int umileage, String color) {
		this.mileage=umileage;
		this.color=color;
	}
	public Car(int umileage, String color, boolean wantRadio) {
		this.mileage=umileage;
		this.color=color;
		if(wantRadio) {
			Radio radio= new Radio(true, true, 0);
		}
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
	
	
	
	public Radio getRadio() {
		return radio;
	}
	
	public Wheels[] getWheels() {
		return wheels;
	}
	public void setWheels(int rad, String type) {
		for(int i =0; i<wheels.length;i++) {
			wheels[i]= new Wheels(rad,type);
		}
	}
	
	
	
	public void drive(int miles) {
		for(int i =0;i<miles;i++) {
			System.out.print("+");
			mileage+=1;
			
		}
		System.out.println();
		amountOfGas -= mpg /miles;
		if(miles>=10) {
			isClean = false;
		}
		
	}
	public void clean() {
		isClean=true;
	}
	@Override
	public String toString() {
		String str =  "Car: color: "+color+" mileage: "+mileage+" Gas: "+amountOfGas+" Is it clean?: "+isClean;
		if(this.getRadio() !=null) {
			return str +" Volume is "+this.getRadio().getVolume();
		}
		else return str;
		
	}
	
}
