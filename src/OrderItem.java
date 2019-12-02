//abstract class for order item e.g. pasta or scrambled eggs
public class OrderItem {
	
	//holds all order item info e.g. pasta, marinara, onions
	private String description;
	
	//default constructor
	public OrderItem() {
		this.description = "";
	}
	//alternate constructor
	public OrderItem(String description) {
		this.description = description;
	}
	
	//getters and setters
	public String getdescription() {
		return this.description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		String result = this.description;
		return result;
	}
	
	public void print() {
		System.out.print(this.toString());
	}
	
}
