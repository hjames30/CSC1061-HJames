
public class TestGeometricObject {

	public static void main(String[] args) {
		Circle test = new Circle(5.6);
		System.out.println(test);
		Circle newtest = new Circle("Red",true,5.3);
		System.out.println(newtest);
		System.out.println("Area of circle 2 is = "+newtest.getArea());
		
		newtest.setRadius(5.6);
		if(test.equals(newtest)) {
			System.out.println("They are equal ");
		}
	}

}
