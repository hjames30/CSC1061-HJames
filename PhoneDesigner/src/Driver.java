import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<Character> IMEI1 = new ArrayList<Character>();
		IMEI1.add('1');
		FlipModel oldPhone = new FlipModel(null, 0, 0, IMEI1);
		FoldModel samsung = new FoldModel(null, 0, 0, IMEI1);
		BarModel barphone = new BarModel(null, 0, 0, IMEI1);

		ArrayList<Character> IMEI2 = new ArrayList<Character>();
		IMEI2.add('2');

		FlipModel blackberry = (FlipModel) oldPhone.clone();
		blackberry.setIMEI(IMEI2);
		blackberry.setAmountOfCache(500);
		FoldModel pixel = (FoldModel) samsung.clone();
		pixel.setIMEI(IMEI2);
		pixel.setAmountOfStorage(486314);
		BarModel apple = (BarModel) barphone.clone();
		apple.setIMEI(IMEI2);
		apple.setAmountOfCache(49543);
		

		if(blackberry.compareTo(oldPhone)==1) {
			System.out.println("BlackBerry is a better phone");
		}else if(blackberry.compareTo(oldPhone)==-1) {
			System.out.println("The old Phone is a better phone");
		}else {
			System.out.println("They have the same specs");
		}
		
		if(pixel.compareTo(samsung)==1) {
			System.out.println("Pixel is a better phone");
		}else if(pixel.compareTo(samsung)==-1) {
			System.out.println("The samsung is a better phone");
		}else {
			System.out.println("They have the same specs");
		}
		
		if(apple.compareTo(barphone)==1) {
			System.out.println("Apple is a better phone");
		}else if(apple.compareTo(barphone)==-1) {
			System.out.println("The Bar Phone is a better phone");
		}else {
			System.out.println("They have the same specs");
		}
		
	

		System.out.println(apple.costToRepair());
		System.out.println(apple.howToRepair());
		System.out.println(apple);

	}

}
