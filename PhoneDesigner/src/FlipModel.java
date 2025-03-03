import java.util.ArrayList;

public class FlipModel extends Phone implements Repairable, Comparable<FlipModel>, Cloneable {

	public FlipModel(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<Character> iMEI) {
		super(typeOfProcessor, amountOfCache, amountOfStorage, iMEI);
		this.typeOfProcessor = "HorseRacer";
		this.amountOfCache = 3;
		this.amountOfStorage = 16;
		this.IMEI = new ArrayList<Character>();
	}

	@Override
	public String toString() {
		return "FlipModel [typeOfProcessor=" + typeOfProcessor + ", amountOfCache=" + amountOfCache
				+ ", amountOfStorage=" + amountOfStorage + ", IMEI=" + IMEI + "]";
	}

	@Override
	public String howToRepair() {

		return "Open it up with screwDriver and flip flip flip";
	}

	@Override
	public double costToRepair() {
		// TODO Auto-generated method stub
		return 50.4;
	}

	@Override
	public int compareTo(FlipModel fm) {
		if (amountOfCache < fm.amountOfCache) {
			return -1;
		}
		if (amountOfCache > fm.amountOfCache) {
			return 1;
		} else if (amountOfCache == fm.amountOfCache) {
			if (amountOfStorage < fm.amountOfStorage) {
				return -1;
			} else if (amountOfStorage > fm.amountOfStorage) {
				return 1;
			}
		}
		return 0;
	}

}
