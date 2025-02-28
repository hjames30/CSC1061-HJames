import java.util.ArrayList;

public abstract class Phone implements Cloneable {
	public String typeOfProcessor;
	public int amountOfCache;
	public int amountOfStorage;
	public ArrayList<Character> IMEI = new ArrayList<>();
	public Phone(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<Character> iMEI) {
		IMEI = iMEI;
	}
	
	
	
}
