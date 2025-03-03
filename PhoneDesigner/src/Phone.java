import java.util.ArrayList;

public abstract class Phone implements Cloneable {
	public String typeOfProcessor;
	public int amountOfCache;
	public int amountOfStorage;
	public ArrayList<Character> IMEI = new ArrayList<>();

	public Phone(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<Character> iMEI) {
		IMEI = iMEI;
	}

	public String getTypeOfProcessor() {
		return typeOfProcessor;
	}

	public void setTypeOfProcessor(String typeOfProcessor) {
		this.typeOfProcessor = typeOfProcessor;
	}

	public int getAmountOfCache() {
		return amountOfCache;
	}

	public void setAmountOfCache(int amountOfCache) {
		this.amountOfCache = amountOfCache;
	}

	public int getAmountOfStorage() {
		return amountOfStorage;
	}

	public void setAmountOfStorage(int amountOfStorage) {
		this.amountOfStorage = amountOfStorage;
	}

	public ArrayList<Character> getIMEI() {
		return IMEI;
	}

	public void setIMEI(ArrayList<Character> iMEI) {
		IMEI = iMEI;
	}

	public Phone clone() throws CloneNotSupportedException {
		Phone clone = (Phone) super.clone();

		clone.IMEI = (ArrayList<Character>) IMEI.clone();
		return clone;
	}

}
