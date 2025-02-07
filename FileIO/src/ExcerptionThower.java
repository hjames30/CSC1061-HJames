import java.io.FileNotFoundException;

public class ExcerptionThower {

	public static void main(String[] args) {
		int [] nums = {1,2,3};
		try {
			setIndex10(nums);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
			
		
		
	}
	public static void setIndex10(int [] arr)throws ArrayIndexOutOfBoundsException {
		if(arr.length<11) {
			throw new ArrayIndexOutOfBoundsException("Need at least 11 elements in array");
		}
		arr[10]=55;
		
	}

}
