
public class RomanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object apple = "apple";
		
		System.out.println(apple.hashCode());
		
	}
	public String romanToInt(String s) {
		for(int i =0; i<s.length();i++) {
			s.replace('I', '1');
			s.replace('V', '5');
			
			
			
		}
		return s;
		
		
	}

}
