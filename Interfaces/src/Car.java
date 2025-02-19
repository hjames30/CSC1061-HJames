
public class Car extends Vechicle {
private double numGallons1;
	public Car(String color, int iD) {
		super(color, iD);
		// TODO Auto-generated constructor stub
	}

	

	public double getNumGallons1() {
		return numGallons1;
	}

	
	public void drive(int numMiles) {
		if(numGallons1 > numMiles/26) {
			System.out.println("You drove "+numMiles+ " miles. You now have "+(numGallons1-(numMiles/35))+" gallons left in your car");
			numGallons1=numGallons1-(numMiles/26);
		}else {
			System.out.println("You cant drive that far you dont have enough gas");
		}
	}
	@Override
	public void feed(int numGallons) {
		System.out.println("You fed "+numGallons+" gallons to your car");
		numGallons1=numGallons1+numGallons;
		System.out.println("You now have "+numGallons1+ " gallons left in your car");
		
	}

}
