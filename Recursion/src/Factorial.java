
public class Factorial {

	public static void main(String[] args) {
		long n =20;
		System.out.println(factorial(n));

	}
	private static long factorial(long n ) {
		if(n==0) {
			return 1;
		}else {
			return n * factorial(n-1);
			
		}
		
	}
	

}
