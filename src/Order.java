import java.util.*;

//list of order items. what will be displayed to the employee
public class Order {
	
	private ArrayList<OrderItem> orderList;	//list to store all order items
	private int orderID;
	private String customer;
	
	public Order(int orderID, String customer) {
		this.orderList = new ArrayList<OrderItem>();
		this.orderID = orderID;
		this.customer = customer;
	}	
	
	//getters and setters
	public ArrayList<OrderItem> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<OrderItem> orderList) {
		this.orderList = orderList;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	public void add(OrderItem item) {
		this.orderList.add(item);
	}
	
	public OrderItem getItem(int i) {
		return this.getOrderList().get(i);
	}
	
	
	public String toString() {
		String result = "Order num:"+this.getOrderID()+" Customer:"+this.getCustomer()+"\n";
		for(int i=0; i<this.orderList.size(); i++) {
			result += this.getItem(i) + "\n";
		}
		return result;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	
	
}
