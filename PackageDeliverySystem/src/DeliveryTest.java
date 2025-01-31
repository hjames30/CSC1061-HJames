
public class DeliveryTest {

	public static void main(String[] args) {
		Destination dest = new Destination("1519 Mt.Meeker","Berthoud","Co");
		Package hoodie = new Package(dest,15.4,20,"Ordered");
		Package tolietPaper = new Package(dest,3.2,2.5,"Shipped");
		Shipment ship = new Shipment();
		ship.addPackage(tolietPaper);
		ship.addPackage(hoodie);
		ship.getTotalCost(tolietPaper);
		ship.updateStatis(tolietPaper, "Arived");
		System.out.println(ship);
		System.out.println();

	}

}
