
public class BreakAndCountine {

	public static void main(String[] args) {
		int[] arr = {3,5,2,6,7,5};
		int index = -1;
		for(int i =0; i< arr.length;i++) {
			if(arr[i]==5) {
				index = i;
				break;
			}
		}
		System.out.println("5 happens in the "+index+" postion in the array.");
		for(int i = 0; i<10; i++) {
			if(i==4) {
				for(int j=0; j<5; j++) {
					if(j==1) {
						break;
					}
				}
			}
			System.out.println("Bottom of Interation #: "+i);
		}

		
	}

}
