import java.util.ArrayList;

public class BarModel extends Phone {

	public BarModel(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<String> iMEI) {
		super(typeOfProcessor, amountOfCache, amountOfStorage, iMEI);
		Phone.typeOfProcessor="DragonSlayer";
		Phone.amountOfCache = 8;
		Phone.amountOfStorage = 32;
	}

}
