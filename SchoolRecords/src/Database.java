import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileLockInterruptionException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
	static File PersonDatabase = new File("Database.csv");
	static PrintWriter pWriter = null;

	public static void writePerson(Person p) throws FileNotFoundException {

		if (!PersonDatabase.exists()) {
			try {
				PersonDatabase.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println("Can not write to file " + PersonDatabase.getName());
				System.exit(-1);
			}
		}
		pWriter = new PrintWriter(new FileOutputStream(PersonDatabase.getName(), true));
		if (p instanceof Student) {
			pWriter.print("Student"+","+p.getName() + "," + p.getAdress() + "," + p.getPhoneNumber() + "," + p.getEmailAddress()
					+ "," + ((Student) p).getStatus());
		} else if (p instanceof Faculty) {
			pWriter.print("Faculty"+","+p.getName() + "," + p.getAdress() + "," + p.getPhoneNumber() + "," + p.getEmailAddress()
					+ "," + ((Employee) p).getOffice() + "," + ((Employee) p).getSalary() + ","
					+ ((Employee) p).getDateHired() + "," + ((Faculty) p).getOfficeHours() + ","
					+ ((Faculty) p).getRank());
		} else if (p instanceof Staff) {
			pWriter.print("Staff"+","+p.getName() + "," + p.getAdress() + "," + p.getPhoneNumber() + "," + p.getEmailAddress()
					+ "," + ((Employee) p).getOffice() + "," + ((Employee) p).getSalary() + ","
					+ ((Employee) p).getDateHired() + "," + ((Staff) p).getDataMember());
		}
		pWriter.print("\n");
		pWriter.flush();

	}

	public static List<Person> readDatabase() throws IOException{
		Scanner input = new Scanner("Database.csv");
		List<Person> listofPeople = new ArrayList<Person>();
		try(BufferedReader br = new BufferedReader(new FileReader("Database.csv")) ){
			String line;
			while((line = br.readLine()) != null ) {
				
				
				String[] tokens = line.split(",");
					if(tokens[0].equals("Student")) {
						Student stu = new Student(tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]);
						listofPeople.add(stu);
					}
					else if(tokens[0].equals("Faculty")) {
						Faculty fac = new Faculty(tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6], tokens[7], tokens[8], tokens[9]);
						listofPeople.add(fac);
					}
					else if (tokens[0].equals("Staff")) {
						Staff sta = new Staff(tokens[1],tokens[2],tokens[3],tokens[4],tokens[5], tokens[6], tokens[7], tokens[8]);
						listofPeople.add(sta);
					}
		}
		
		
				
		}
		return listofPeople;
		
	}
}
