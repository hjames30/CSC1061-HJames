
public class Dog extends Animal {
	private double earSize;

	public Dog(String name, int age, double weight,
			double earSize) {
		super(name, age, weight);
		this.earSize = earSize;
	}

	public double getEarSize() {
		return earSize;
	}

	public void setEarSize(double earSize) {
		this.earSize = earSize;
	}
	public static void makeSound() {
		System.out.println("Woof, Woof!! Bark!!");
	}

	@Override
	public String toString() {
		return "Dog Age()=" + getAge() + ", Name()=" + getName() + ", Weight()=" + getWeight() + ", earSize="
				+ earSize;
	}
	
	
	
}
