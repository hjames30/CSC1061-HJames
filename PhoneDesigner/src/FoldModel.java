import java.util.ArrayList;

public class FoldModel extends Phone  {

	public FoldModel(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<Character> iMEI) {
		super(typeOfProcessor, amountOfCache, amountOfStorage, iMEI);
		this.typeOfProcessor="SpeedRacer 800";
		this.amountOfCache = 6;
		this.amountOfStorage = 64;
		
	}

	@Override
	public String toString() {
		return "FoldModel [typeOfProcessor=" + typeOfProcessor + ", amountOfCache=" + amountOfCache
				+ ", amountOfStorage=" + amountOfStorage + ", IMEI=" + IMEI + "]";
	}

	



}
