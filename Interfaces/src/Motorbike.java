
public class Motorbike extends Vechicle {
private double numGallons1;
	public Motorbike(String color, int iD) {
		super(color, iD);

	}

	public double getNumGallons1() {
		return numGallons1;
	}

	

	@Override
	public void drive(int numMiles) {
		if(numGallons1 > numMiles/35) {
			System.out.println("You drove "+numMiles+ " miles. You now have "+(numGallons1-(numMiles/35))+" gallons left");
			numGallons1=numGallons1-(numMiles/35);
		}else {
			System.out.println("You can't Drive that far, you dont have enough gas");
		}
	}

	@Override
	public void feed(int numGallons) {
		System.out.println("You fed "+numGallons+" gallons to your motorbike");
		numGallons1=numGallons1+numGallons;
		System.out.println("You now have "+numGallons1+ " gallons left");
		
	}

}
