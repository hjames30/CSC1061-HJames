import java.util.ArrayList;

public class FoldModel extends Phone {

	public FoldModel(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<String> iMEI) {
		super(typeOfProcessor, amountOfCache, amountOfStorage, iMEI);
		Phone.typeOfProcessor="SpeedRacer 800";
		Phone.amountOfCache = 6;
		Phone.amountOfStorage = 64;
		
	}

}
