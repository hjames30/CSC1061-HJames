import java.util.Arrays;

public class FIAbstractTest {

	public static void main(String[] args) {
		FIAbstract[] arrayOfFI = new FIAbstract[3]; 
		
		arrayOfFI[0]=new Bank("Chase", 43214, 4002, new Address("12", "Grover St.", "Fort", "CO", 80516) , 1.5);
		arrayOfFI[1] = new CreditUnion("Premier", 43211, 4001, new Address("235", "Street street", "Loveland", "CO", 7), 3.4);
		arrayOfFI[2]=new Bank("Blank Bank", 80000, 48918, null, 6.4);
		for(FIAbstract fi: arrayOfFI) {
			System.out.println(fi);
		}
		Arrays.sort(arrayOfFI);
		for(FIAbstract fi: arrayOfFI) {
			System.out.println(fi);
		}
	}

}
