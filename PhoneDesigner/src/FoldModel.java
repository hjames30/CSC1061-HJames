import java.util.ArrayList;

public class FoldModel extends Phone implements Comparable<FoldModel> {

	public FoldModel(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<Character> iMEI) {
		super(typeOfProcessor, amountOfCache, amountOfStorage, iMEI);
		this.typeOfProcessor = "SpeedRacer 800";
		this.amountOfCache = 6;
		this.amountOfStorage = 64;
		this.IMEI = new ArrayList<Character>();
	}

	@Override
	public int compareTo(FoldModel fm) {
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

	@Override
	public String toString() {
		return "FoldModel [typeOfProcessor=" + typeOfProcessor + ", amountOfCache=" + amountOfCache
				+ ", amountOfStorage=" + amountOfStorage + ", IMEI=" + IMEI + "]";
	}

}
