import java.util.Arrays;

public class FIAbstractTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		FIAbstract[] arrayOfFI = new FIAbstract[3]; 
		
		arrayOfFI[0]=new Bank("Chase", 43214, 4002, new Address("12", "Grover St.", "Fort", "CO", 80516) , 1.5);
		arrayOfFI[1] = new CreditUnion("Premier", 43211, 4001, new Address("235", "Street street", "Loveland", "CO", 7), 3.4);
		arrayOfFI[2]=new Bank("Blank Bank", 80000, 48918, null, 6.4);
		System.out.println("Printing all banks: \n");
		for(FIAbstract fi: arrayOfFI) {
			System.out.println(fi);
		}
		System.out.println("\n Print all banks after Sort: \n");
		Arrays.sort(arrayOfFI);
		for(FIAbstract fi: arrayOfFI) {
			System.out.println(fi);
		}
		Address addr = new Address();
		addr.setLine1("555 Merry Way");
		addr.setZip(80525);
		Bank bank1 = new Bank("Wells Fargo",4 , 102006, addr, 2.5);
		
		//How to Clone 
		//needs to be a protected object||Cloneable Interface 
		Bank bank2 = (Bank) bank1.clone();
		
		//Setting new variables to clone bank 
		//When Changing address have to create a new Adress because address is saved to both Banks 
		bank2.setFiName("Wells Fargo 2 \n");
		Address addy2 = new Address();
		addy2.setLine1("Cool Street");
		addy2.setZip(80513);
		bank2.setAdress(addy2);
		
		
		//
		
		
		
		//Printing new and old Bank
		System.out.println("\n Bank Clone Test \n");
		System.out.println(bank1);
		System.out.println(bank2);
		
	}

}
