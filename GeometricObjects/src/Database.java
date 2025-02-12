import java.util.LinkedList;
import java.util.List;

public class Database {
	public static List<GeometricObjects> readDatabase(){
		List<GeometricObjects> objlist = new LinkedList<>();
		GeometricObjects obj = null;
		
		try {
			while((obj = readGeometricObjects()) !=null) {
				objlist.add(obj);
				
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return objlist;
	}
}
