
public abstract class FIAbstract implements Comparable<FIAbstract> {

	private String fiName;
	private long fiID;
	private long routingNum;
	private Address adress;
	
	public FIAbstract(String fiName, long fiID, long routingNum, Address adress) {
		super();
		this.fiName = fiName;
		this.fiID = fiID;
		this.routingNum = routingNum;
		this.adress = adress;
	}
	public String getFiName() {
		return fiName;
	}
	public void setFiName(String fiName) {
		this.fiName = fiName;
	}
	public long getFiID() {
		return fiID;
	}
	public void setFiID(long fiID) {
		this.fiID = fiID;
	}
	public long getRoutingNum() {
		return routingNum;
	}
	public void setRoutingNum(long routingNum) {
		this.routingNum = routingNum;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public abstract double getIntrestRate();
	
	public int compareTo(FIAbstract fi) {
		if(fiID<fi.fiID) {
			return -1;
		}
		if(fiID > fi.fiID) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "FIAbstract [fiName=" + fiName + ", fiID=" + fiID + ", routingNum=" + routingNum + ", adress=" + adress
				+ "]";
	}
	
}
