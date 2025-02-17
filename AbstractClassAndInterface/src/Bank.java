
public class Bank extends FIAbstract  {
private double intrestRate;
	public Bank(String fiName, long fiID, long routingNum, Address adress,double iRate) {
		super(fiName, fiID, routingNum, adress);
		this.intrestRate=iRate;
	}

	@Override
	public double getIntrestRate() {
		
		return intrestRate;
	}
	
}
