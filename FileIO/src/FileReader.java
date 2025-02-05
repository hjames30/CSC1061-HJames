import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		File readFile = new File("fileWriteTest.txt");
		try {
			Scanner input = new Scanner(readFile);
			while (input.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Make sure file is named fileWriteTest.txt");
		}

	}

}
