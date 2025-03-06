package default2;

import java.io.IOException;
import java.util.ArrayList;

public class ReceiptTester {

	public static void main(String[] args) throws IOException {
		//Instantiate ReceiptFileHandler
		ReceiptFileHandler checkout = new ReceiptFileHandler("ReceiptPrinter.csv");
		
		ArrayList<Receipt> fromKing = new ArrayList<Receipt>();
		
		fromKing.add(new Receipt("Banna", 1.25,12 )); 
		fromKing.add(new Receipt("appleJuice", 3.25, 2));
		fromKing.add(new Receipt("ToothPaste", 4.21, 2));
		fromKing.add(new Receipt("Vegg platter", 10, 1));
		
		for(Receipt r:fromKing) {
			checkout.writeToCSV(r);
		}
		checkout.readFromCSV();
	}

}
