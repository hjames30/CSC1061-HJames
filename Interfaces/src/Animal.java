
public class Animal implements Feedable {
	private String name;
	private double weight;
	
	public Animal(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void feed(int numGallons) {
		System.out.println("You fed "+numGallons+" gallons. YUM YUM YUM");
		
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + "]";
	}

}
