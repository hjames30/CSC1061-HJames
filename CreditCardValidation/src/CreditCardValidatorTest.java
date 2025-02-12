import java.util.Scanner;

public class CreditCardValidatorTest {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter in your credit card number");
		long num = input.nextLong();
		boolean isValued = CreditCardValidator.isValid(num);
		if(isValued)
			System.out.println("Thanks for the Credit card");
		if(!isValued)
			System.out.println("Whoops your card was not put in correctly");
		
		
		
		
	}

}
