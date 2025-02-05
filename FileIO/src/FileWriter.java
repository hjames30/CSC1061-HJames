import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class FileWriter {
//comma when adding multiple throw exceptions
	public static void main(String[] args) {
		File myFile = new File("fileWriteTest.txt");
		if (!myFile.exists()) {
			try {
				myFile.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println("Can not write to file " + myFile.getName());
				System.exit(-1);
			}

		}
		// must declare outside of the try block catch
		PrintWriter pWriter = null;
		try {
			pWriter = new PrintWriter(new FileOutputStream(myFile.getName(), false));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(-1);
		}
		pWriter.append("The moon is full today!\n");

		pWriter.printf("The answer is %d \n", 3 + 2);
		pWriter.close();
		// flush();
	}

}
