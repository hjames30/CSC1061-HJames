import java.util.ArrayList;

public class FlipModel extends Phone implements Repairable {

	public FlipModel(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<Character> iMEI) {
		super(typeOfProcessor, amountOfCache, amountOfStorage, iMEI);
		typeOfProcessor="HorseRacer";
		amountOfCache=3;
		amountOfStorage=16;
		
	}
	

	

	@Override
	public String toString() {
		return "FlipModel [typeOfProcessor=" + typeOfProcessor + ", amountOfCache=" + amountOfCache
				+ ", amountOfStorage=" + amountOfStorage + ", IMEI=" + IMEI + "]";
	}


	@Override
	public String howToRepair() {
		
		return "Open it up with screwDriver and flip flip flip";
	}

	@Override
	public double costToRepair() {
		// TODO Auto-generated method stub
		return 50.4;
	}

}
