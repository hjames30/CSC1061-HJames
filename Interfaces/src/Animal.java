
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

	

	public double getWeight() {
		return weight;
	}

	
	@Override
	public void feed(int numGallons) {
		System.out.println("You fed "+numGallons+" gallons. YUM YUM YUM");
		System.out.println(name+" is now "+ weight+numGallons+" pounds");
		weight = weight + numGallons;
		
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + "]";
	}

}
