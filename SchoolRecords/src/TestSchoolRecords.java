import java.io.IOException;

public class TestSchoolRecords {

	public static void main(String[] args) throws IOException {
		Person holden = new Student("Holden","1519 Mt. Meeker.Ave","303961053","holdendjames@gmail.com","Senior");
		Person george = new Student("George","HouseSt.","332232321","Gerogre@gmail.com","Freshman");
		Person Jan = new Faculty("jan","House.ave","3242","Jan@email","jan office","4453","01","4-2","Janitor");
		Person Jan2 = new Faculty("jan2","House2.ave","3241","Jan@email2","jan office2","4453","01","4-2","Janitor2");
		Person Kishore = new Staff("Kishore","KishoreHouse","212431","Kishore@email","Kishore office","43113","02","Datamemeber");
		Person Kishore2 = new Staff("Kishore2","KishoreHouse2","212431","Kishore@email2","Kishore office2","43113","02","Datamemeber2");
		
		Database.writePerson(holden);
		Database.writePerson(george);
		Database.writePerson(Jan);
		Database.writePerson(Jan2);
		Database.writePerson(Kishore);
		Database.writePerson(Kishore2);
		
		
		System.out.println(Database.readDatabase().toString());
	}

}
