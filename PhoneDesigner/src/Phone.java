import java.util.ArrayList;

public abstract class Phone implements Comparable<Phone>,Cloneable {
	public String typeOfProcessor;
	public int amountOfCache;
	public int amountOfStorage;
	public ArrayList<Character> IMEI = new ArrayList<>();
	public Phone(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<Character> iMEI) {
		IMEI = iMEI;
	}
	public int compareTo(Phone pH) {
		if(amountOfCache < pH.amountOfCache) {
			return -1;
		}
		if (amountOfCache > pH.amountOfCache) {
			return 1;
		}
		return 0;
	}
	
	
}
