import java.util.ArrayList;
import java.util.List;

public class Shipment {
	private List<Package> packages = new ArrayList<>();

	public Shipment() {

	}

	public void addPackage(Package pack) {
		packages.add(pack);
	}

	public double getTotalCost() {
		double cost =0;
		for(int i=0;i< packages.size();i++) {
			Package testPack =packages.get(i);
			 cost =+	testPack.calulateCost(testPack.getWeightKg(), testPack.getWeightKg());
			
		}
		return cost;
		
	}

	public void updateStatis(Package pack, String update) {
		pack.setStatus(update);
	}

	@Override
	public String toString() {
		return "Shipment [packages=" + packages + "]";
	}

}
