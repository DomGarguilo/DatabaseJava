//abstract class for order item e.g. pasta or scrambled eggs
public  abstract class OrderItem {
	
	
	private int orderID;
	private int customerID;
		
	//default constructor
	public OrderItem() {
		this.setOrderID(0);
		this.setCustomerID(0);
	}
	//alternate constructor
	public OrderItem(int orderID, int customerID) {
		this.setOrderID(orderID);
		this.setCustomerID(customerID);
	}

	//getters and setters
	public int getCustomerID() {
		return this.customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}	
	public int getOrderID() {
		return this.orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	public abstract String toString();
	public abstract void print();
	
}
