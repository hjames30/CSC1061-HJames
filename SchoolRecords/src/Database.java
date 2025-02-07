import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Database {
	private static File PersonDatabase = new File("PersonDatabase");
	
	public void writePerson(Person p) {
		
		if(!PersonDatabase.exists()) {
			try { 
				PersonDatabase.createNewFile();
			} catch(IOException e) {
				System.out.println(e.getMessage());
				System.out.println("Can not write to file "+PersonDatabase.getName());
				System.exit(-1);
			}
		}
		PrintWriter pWriter = null;
		try {
			pWriter = new PrintWriter(new FileOutputStream(PersonDatabase.getName(), false));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(-1);
		}
		
		
		if(p instanceof Student) {
			pWriter.append()
		}
	}
}
