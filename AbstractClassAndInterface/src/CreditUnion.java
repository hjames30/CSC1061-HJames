
public class CreditUnion extends FIAbstract {
private double intrestRate;
	public CreditUnion(String fiName, long fiID, long routingNum, Address adress, double iRate) {
		super(fiName, fiID, routingNum, adress);
		this.intrestRate=iRate;
	}
	@Override
	public double getIntrestRate() {
		// TODO Auto-generated method stub
		return intrestRate;
	}

}
