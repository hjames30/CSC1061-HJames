import java.util.ArrayList;

public class FlipModel extends Phone {

	public FlipModel(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<String> iMEI) {
		super(typeOfProcessor, amountOfCache, amountOfStorage, iMEI);
		this.typeOfProcessor="HorseRacer";
		this.amountOfCache=3;
		this.amountOfStorage=16;
		
	}

}
