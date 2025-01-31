
public class Package {
	private Destination dest = new Destination(null , null, null);
	public double weightKg;
	public double costPerKg;
	private String status;
	private int trackingNumber= generateTrackingNum();
	public Package(Destination dest, double weightKg, double costPerKg, String status) {
		super();
		this.dest = dest;
		this.weightKg = weightKg;
		this.costPerKg = costPerKg;
		status = status;
	}
	private int generateTrackingNum() {
		return ((int)Math.random()*(999999999-1111111111)+1)+1111111111;
	}
	private String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getWeightKg() {
		return weightKg;
	}
	public void setWeightKg(double weightKg) {
		this.weightKg = weightKg;
	}
	public double getCostPerKg() {
		return costPerKg;
	}
	public void setCostPerKg(double costPerKg) {
		this.costPerKg = costPerKg;
	}
	private void updateStatus(String Status) {
		this.status=Status;
	}
	public double calulateCost(double weightKg,double costPerKg) {
		return costPerKg*weightKg;
		
	}
	@Override
	public String toString() {
		return "Package [dest=" + dest + ", weightKg=" + weightKg + ", costPerKg=" + costPerKg + ", Status=" + status
				+ ", trackingNumber=" + trackingNumber + "]";
	}
	
	
	
}
