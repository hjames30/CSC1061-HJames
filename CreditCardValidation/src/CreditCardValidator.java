
public class CreditCardValidator {

	public static boolean isValid(long cnum) {
		
		//Initializes prefixes
		long prefix = getPrefix(cnum, 1);
		//checks if length is 13-16
		if(getSize(cnum)<13) {
			return false;
		}if(getSize(cnum)>16) {
			return false;
		//checks prefix	
		}if(prefix != 4 && prefix != 6 && getPrefix(cnum,2) !=37 && prefix!= 6) {
			return false;
		}if(sumOfBoth(sumOfEvenPlace(cnum), sumOfOddPlace(cnum))%10 !=0) {
			return false;
		}
		
		return true;
	}

	private static int getSize(long cnum) {
		int count = 0;
		while (cnum >= 10) {
			cnum = cnum / 10;
			count++;
		}
		return count;

	}

	private static long getPrefix(long number, int k) {
		String str = String.valueOf(number);

		if (str.length() < k) {
			throw new IllegalArgumentException("CreidtCard Number is lower then digits requested");

		}
		String prefixStr = str.substring(0, k);

		long retNum = Long.parseLong(prefixStr);
		return retNum;
	}

	private static int sumOfEvenPlace(long number) {
		String str = String.valueOf(number);
		int num =0;
		for (int i = str.length() - 2; i > -1; i -= 2) {
			char c = str.charAt(i);
			int product = Character.getNumericValue(c) * 2;
			if (product >= 10) {
				String str2 = String.valueOf(product);
				char b = str2.charAt(0);
				char a = str2.charAt(1);
				product = Character.getNumericValue(a) + Character.getNumericValue(b);
			}
			 num =num +product;
		}
		return num;

	}
	private static int sumOfOddPlace(long number) {
		String str = String.valueOf(number);
		int num = 0;
		for(int i = str.length()-1;i>-1;i-=2) {
			char c = str.charAt(i);
			int product = Character.getNumericValue(c);
			num = num +product;
		}
		return num;
		
	}
	private static int sumOfBoth(int odd,  int even) {
		return odd +even;
	}
}
