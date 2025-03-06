package default2;

import java.io.IOException;
import java.util.ArrayList;

public class ReceiptTester {

	public static void main(String[] args) throws IOException {
		// Instantiate ReceiptFileHandler
		ReceiptFileHandler checkout = new ReceiptFileHandler("ReceiptPrinter.csv");

		ArrayList<Receipt> fromKingSup = new ArrayList<Receipt>();

		fromKingSup.add(new Receipt("Banna", 1.25, 12));
		fromKingSup.add(new Receipt("appleJuice", 3.25, 2));
		fromKingSup.add(new Receipt("ToothPaste", 4.21, 1));
		fromKingSup.add(new Receipt("Vegg platter", 10, 1));

		for (Receipt r : fromKingSup) {
			checkout.writeToCSV(r);
		}
		System.out.println(checkout.readFromCSV());
	}

}
