
public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car awesomeCar = new Car();
		/*
		 * System.out.println(awesomeCar);
		 * 
		 * Car ocar = new Car("Pink",50); System.out.println(ocar.getColor());
		 * ocar.setColor("Platnium"); System.out.println(ocar);
		 * 
		 * Car tcar = new Car(50, "Pink"); System.out.println(tcar);
		 */
		System.out.println(awesomeCar);
		awesomeCar.drive(5);
		System.out.println(awesomeCar);
		
		Car ocar = new Car("Pink",50,20.2,true,true);
		ocar.getRadio().setVolume(50);
		System.out.println("Volume is "+ocar.getRadio().getVolume());
		ocar.setWheels(18, "Alloy");
		
		Wheels[] wheels = ocar.getWheels();
		//for each Wheel in wheels (Called wheel)
		for (Wheels wheel: wheels) {
			System.out.println(wheels.toString());
		}
		
		CarWash.cleanCar(ocar);
		
		
	}

}
