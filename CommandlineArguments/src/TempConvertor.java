
public class TempConvertor {

	public static void main(String[] args) {
		double answer = 0.0;
		
		if(args.length < 2) {
			System.out.println("Usage:");
			System.out.println("\t -f temp convertor Celious to Fahrenheight");
			System.out.println("\t -c temp convertor Fahrenheight to Celious");
			System.exit(0);
		switch (args[0]) {

		case "-c":
			answer =convertFahToCel(Double.parseDouble(args[1]));
			System.out.println("The celius value is " + answer);
			break;
		case "-f":
			answer = convertCelToFah(Double.parseDouble(args[1]));
			System.out.println("The Fahrenheit value is " + answer);
			break;

		}
		}	
		

	}

	public static double convertFahToCel(double fah) {
		return ((fah - 32) * 5.0 / 9.0);

	}

	public static double convertCelToFah(double cel) {
		return ((cel * (9.0 / 5.0)) + 32);
	}
}
