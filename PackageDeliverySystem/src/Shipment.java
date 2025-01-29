import java.util.ArrayList;
import java.util.List;

public class Shipment {
	private List<Package>packages = new ArrayList<>();
	public Shipment() {
		
	}
	
	public void addPackage(Package pack) {
		packages.add(pack);
	}
	public double getTotalCost(Package pack) {
		return pack.calulateCost(pack.getWeightKg(), pack.getCostPerKg());
	}
	public void updateStatis(String) {
		
	}
}

