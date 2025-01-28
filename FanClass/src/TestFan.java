
public class TestFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan cool = new Fan(Fan.fast, true, 10, "yellow");

		System.out.println(cool.toString(cool.isOn()));
		Fan hot = new Fan(Fan.medium, false, 5, "blue");

		System.out.println(hot.toString(hot.isOn()));
	}

}
