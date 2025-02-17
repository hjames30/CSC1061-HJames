import java.util.ArrayList;

public class FlipModel extends Phone {

	public FlipModel(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<String> iMEI) {
		super(typeOfProcessor, amountOfCache, amountOfStorage, iMEI);
		Phone.typeOfProcessor="HorseRacer";
		Phone.amountOfCache=3;
		Phone.amountOfStorage=16;
		
	}

}
