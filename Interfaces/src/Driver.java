
public class Driver {

	public static void main(String[] args) {
		Bike awesomeBike = new Bike("Blue",0);
		awesomeBike.drive(50);
		
		
		try {
		awesomeBike.feed(2);
		}
		catch(UnsupportedOperationException e){
			System.out.println(e.getMessage());
		}
		Car myCar = new Car("Sliver", 420);
		myCar.feed(18);
		myCar.feed(5);
		myCar.drive(500);
		myCar.drive(500);
		myCar.drive(400);
		Animal myAnimal = new Animal("Silly guy", 133);
		myAnimal.feed(593);
	}
	
}
