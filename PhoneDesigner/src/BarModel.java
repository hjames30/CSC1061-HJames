import java.util.ArrayList;

public class BarModel extends Phone implements Repairable,Comparable<BarModel> {

	public BarModel(String typeOfProcessor, int amountOfCache, int amountOfStorage, ArrayList<Character> iMEI) {
		super(typeOfProcessor, amountOfCache, amountOfStorage, iMEI);
		this.typeOfProcessor="DragonSlayer";
		this.amountOfCache = 8;
		this.amountOfStorage = 32;
		this.IMEI=new ArrayList<Character>();
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
	public int compareTo(BarModel br) {
		if(amountOfCache < br.amountOfCache) {
			return -1;
		}
		if (amountOfCache > br.amountOfCache) {
			return 1;
		}
		else if(amountOfCache==br.amountOfCache) {
			if(amountOfStorage<br.amountOfStorage) {
				return -1;
			}else if(amountOfStorage>br.amountOfStorage) {
				return 1;
			}
		}
		return 0;
	}


	@Override
	public String toString() {
		return "BarModel [typeOfProcessor=" + typeOfProcessor + ", amountOfCache=" + amountOfCache
				+ ", amountOfStorage=" + amountOfStorage + ", IMEI=" + IMEI + "]";
	}

}
