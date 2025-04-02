
public class Fibinaci {
	private static long counter = 0;
	private static long newCounter = 0;
	private static long[] termArray = new long[200];
	private static long itCounter=0;
	public static void main(String[] args) {
		int n = 6;
		System.out.println(fib(n));
		
		System.out.println("Counter:" + counter);
		System.out.println(fibDynamic(n));
		System.out.println("New Counter:" + newCounter);
		System.out.println(fibIterative(n));
		System.out.println("Itreatble counter:"+itCounter);

	}

	public static int fib(int n) {
		counter++;

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {

			return fib(n - 1) + fib(n - 2);
		}
	}

	public static long fibDynamic(int n) {

		if (n < 2) {
			return n;
		}
		if (termArray[n] > 0) {
			return termArray[n];
		}
		newCounter++;
		long ans = fibDynamic(n - 1) + fibDynamic(n - 2);
		termArray[n] = ans;
		return ans;
	}
	public static long fibIterative(int n) {
		if(n<2) {
			return n;
		}
		long currTerm=0;
		long prevTerm1 =1;
		long prevTerm2=0;
		
		for(int i =2;i<=n;i++) {
			currTerm = prevTerm1+prevTerm2;
			prevTerm2=prevTerm1;
			prevTerm1 = currTerm;
			itCounter++;
			 
		}
		
		return currTerm;
	}
}
