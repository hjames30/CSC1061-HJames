
public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car awesomeCar = new Car();
		System.out.println(awesomeCar);
		
		Car ocar = new Car("Pink",50);
		System.out.println(ocar.getColor());
		ocar.setColor("Platnium");
		System.out.println(ocar);
		
		Car tcar = new Car(50, "Pink");
		System.out.println(tcar);
	}
	

}
