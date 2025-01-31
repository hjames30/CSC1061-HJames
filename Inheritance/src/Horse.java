
public class Horse extends Animal {
	private String coat;

	public Horse(String name, int age, double weight, 
			String coat) {
		super(name, age, weight);
		this.coat = coat;
	}

	public String getCoat() {
		return coat;
	}

	public void setCoat(String coat) {
		this.coat = coat;
	}
	public static void makeSound() {
		System.out.println("Neigh Neighh");
	}

	@Override
	public String toString() {
		return "Horse Name()=" + getName() + ", Age()=" + getAge() + ", Weight()=" + getWeight() + ", coat="
				+ coat;
	}
	
	
}
