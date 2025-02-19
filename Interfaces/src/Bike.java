
public class Bike extends Vechicle {

	public Bike(String color, int iD) {
		super(color, iD);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive(int numMiles) {
		System.out.println("You drove "+numMiles+" miles in your bike");
		
	}

	@Override
	public void feed(int numGallons) throws UnsupportedOperationException {
		
		throw new UnsupportedOperationException("You can't feed a bike");
		
	}

}
