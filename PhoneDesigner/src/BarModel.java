import java.util.ArrayList;

public class BarModel extends Phone implements Repairable {

	public BarModel(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<Character> iMEI) {
		super(typeOfProcessor, amountOfCache, amountOfStorage, iMEI);
		this.typeOfProcessor="DragonSlayer";
		this.amountOfCache = 8;
		this.amountOfStorage = 32;
	}

	

	@Override
	public String howToRepair() {
		// TODO Auto-generated method stub
		return "Thorw into rice to suck up the water and then bar";
	}

	@Override
	public double costToRepair() {
		// TODO Auto-generated method stub
		return 42.5;
	}



	@Override
	public String toString() {
		return "BarModel [typeOfProcessor=" + typeOfProcessor + ", amountOfCache=" + amountOfCache
				+ ", amountOfStorage=" + amountOfStorage + ", IMEI=" + IMEI + "]";
	}

}
