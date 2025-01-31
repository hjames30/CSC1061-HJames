
public class Farm {

	public static void main(String[] args) {
		Cat johnston = new Cat("Johnston",6,4.0,2);
		Dog carl = new Dog("Carl",3,2,1);
		Horse harry = new Horse("Henrey",3,2,"White Massive");
		System.out.println(johnston);
		johnston.makeSound();
		System.out.println(carl);
		carl.makeSound();
		System.out.println(harry);
		harry.makeSound();
		
		
		Animal[] animals = new Animal[3];
		animals[0]= johnston;
		animals[1] = new Dog("Rover",3,45,6);
		//System.out.println(animals.toString());
		
		String animalType = identifyAnimal(animals[1]);
		System.out.println("Animal is a "+animalType);
	}

	private static String identifyAnimal(Animal animal) {
		
		//return animal.getClass().getSimpleName();
		if(animal instanceof Dog) {
			return "dog";
		}
		if(animal instanceof Cat) {
			return "cat";
		}
		if(animal instanceof Horse) {
			return "horse";
		}
		return null;
	}
	

}
