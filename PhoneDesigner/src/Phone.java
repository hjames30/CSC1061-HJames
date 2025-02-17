import java.util.ArrayList;

public abstract class Phone {
	public String typeOfProcessor;
	public int amountOfCache;
	public int amountOfStorage;
	public ArrayList<String> IMEI = new ArrayList<>();
	public Phone(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<String> iMEI) {
		IMEI = iMEI;
	}
	
}
