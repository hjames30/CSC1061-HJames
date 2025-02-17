import java.util.ArrayList;

public class Phone {
	public static String typeOfProcessor;
	public static int amountOfCache;
	public static int amountOfStorage;
	public ArrayList<String> IMEI = new ArrayList<>();
	public Phone(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<String> iMEI) {
		IMEI = iMEI;
	}
	
}
