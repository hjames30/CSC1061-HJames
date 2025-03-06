package default2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReceiptFileHandler {

	private final String filename;

	public ReceiptFileHandler(String filename) {
		this.filename = filename;
		File file = new File(filename);
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			System.err.println("Error creating or accessing file: " + e.getMessage());
		}
	}

	public void writeToCSV(Receipt receipt) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) { // append is set to true
			writer.println(receipt.getItemName() + "," + receipt.getPrice() + "," + receipt.getQuantity() + ","
					+ receipt.getTotal());
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}
	}

	public ArrayList<Receipt> readFromCSV() throws IOException {
		Scanner input = new Scanner(filename);
		ArrayList<Receipt> listOfRecepit = new ArrayList<Receipt>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = br.readLine()) != null) {

				String[] tokens = line.split(",");
				Receipt temp = new Receipt(tokens[0], Double.valueOf(tokens[1]), Integer.valueOf(tokens[2]));
				listOfRecepit.add(temp);
			}
		}
		return listOfRecepit;

	}

}
