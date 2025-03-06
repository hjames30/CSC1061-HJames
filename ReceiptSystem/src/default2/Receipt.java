package default2;

public class Receipt {
	private String itemName;
	private double price;
	private int quantity;
	private double total;
	
	public Receipt(String itemName, double price, int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.total=price*quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "\n"
				+ "itemName=" + itemName + "\n"
				+ " price=" + price + "$\n"
				+ " quantity=" + quantity + "\n"
				+ " total=" + total+"$\n";
		
	}
	
	
}
