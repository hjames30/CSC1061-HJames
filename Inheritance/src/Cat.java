
public class Cat extends Animal {
	private double whiskerSize;

	public Cat(String name, int age, double weight,
			double whiskerSize) {
		super(name, age, weight);
		this.whiskerSize = whiskerSize;
	}

	public double getWhiskerSize() {
		return whiskerSize;
	}

	public void setWhiskerSize(double whiskerSize) {
		this.whiskerSize = whiskerSize;
	}
	public static void makeSound() {
		System.out.println("MEOWWWW!! Purrrrrrrrr");
	}

	@Override
	public String toString() {
		return "Cat"+"Name()=" + getName() + ", Age()=" + getAge()
				+ ", Weight()=" + getWeight() + " whiskerSize= " + whiskerSize;
	}

}
