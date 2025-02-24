import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		// Array list for strings ex.
		List<String> Colors = new ArrayList<>();
		Colors.add("Blue");
		Colors.add("Red");
		// Array ex.
		String[] Primary = { "Red", "blue", "Green" };

		// Array list for ints ex.
		List<Integer> ints = new ArrayList<>();

		// Makes x_obj an object with vaule of 3 to add to ints list
		Integer x_obj = Integer.valueOf(3);
		

		// This works because of autoboxing(Makes 4 an object)
		ints.add(4);
		
		//Auto-unboxing example
		int inum = x_obj;
		
		List<Double> dbs = new ArrayList<>();
		dbs.add(Double.valueOf(Math.PI));
		dbs.add(Math.PI);
		
		ReverseList<Integer> revInt = new ReverseList<>();
		
		revInt.add(1);
		revInt.add(2);
		revInt.add(3);
		for(Integer i: revInt.getList()) {
			System.out.println(i.toString());
		}
		ReverseList<String> revString = new ReverseList<>();
		revString.add("Six");
		
	}

}
