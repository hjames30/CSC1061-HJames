
public class BinaryRecursion {

	public static void main(String[] args) {
		displayBinary(777777777);
		

	}
	public static void displayBinary(int n) {
		if(n==0) {
			return;
		}
		
		displayBinary(n/2);
		System.out.print(n%2);
		
		
	}
}
