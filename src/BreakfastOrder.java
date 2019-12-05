
public class BreakfastOrder extends Order {
	
	private int pancake_quantity;
	private int fried_egg_quantity;
	private int omlette; //false = no omlette & vise versa
	private int scrambled_eggs; //false = no omlette & vise versa
	private String ingredients;
	private String seasonings;
	private int bacon_quantity;
	private int sausage_quantity;
	
	

	public BreakfastOrder(int orderID, int customer, int pancake_quantity, int fried_egg_quantity, int omlette, int scrambled_eggs,
			String ingredients, String seasonings, int bacon_quantity, int sausage_quantity) {
		
		super(orderID, customer);
		this.setPancake_quantity(pancake_quantity);
		this.setFried_egg_quantity(fried_egg_quantity);
		this.setOmlette(omlette);
		this.setScrambled_eggs(scrambled_eggs);
		this.setIngredients(ingredients);
		this.setSeasonings(seasonings);
		this.setBacon_quantity(bacon_quantity);
		this.setSausage_quantity(sausage_quantity);
	}
	
	//default constructor
	public BreakfastOrder() {
		super(0, 0);
		this.setPancake_quantity(0);
		this.setFried_egg_quantity(0);
		this.setOmlette(0);
		this.setScrambled_eggs(0);
		this.setIngredients("");
		this.setSeasonings("");
		this.setBacon_quantity(0);
		this.setSausage_quantity(0);
	}
	
	public void pushToDatabase() {
		String q = new String();
		q = "INSERT INTO `dgargu1db`.`breakfast` (`order_num`, `cust_ID`, `pancake_quantity`, `fried_egg_quantity`, `omlette`, `scrambled_eggs`, `ingredients`, `seasonings`, `bacon_quantity`, `sausage_quantity`) "
				+ "VALUES ("+this.getOrderID()+", "+ this.getCustomer()+", "+ this.getPancake_quantity()+", "+this.getFried_egg_quantity()+", "
				+ this.getOmlette()+", "+this.getScrambled_eggs()+", '"+this.getSeasonings()+"', '"+this.getIngredients()+"', "
				+ this.getBacon_quantity()+", "+this.getSausage_quantity()+");";
		System.out.println(q);
		QueryClass.update(q);

	}

	public int getPancake_quantity() {
		return pancake_quantity;
	}
	public void setPancake_quantity(int pancake_quantity) {
		this.pancake_quantity = pancake_quantity;
	}
	public int getFried_egg_quantity() {
		return fried_egg_quantity;
	}
	public void setFried_egg_quantity(int fried_egg_quantity) {
		this.fried_egg_quantity = fried_egg_quantity;
	}
	public int getOmlette() {
		return omlette;
	}
	public void setOmlette(int omlette) {
		this.omlette = omlette;
	}
	public int getScrambled_eggs() {
		return scrambled_eggs;
	}
	public void setScrambled_eggs(int scrambled_eggs) {
		this.scrambled_eggs = scrambled_eggs;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getSeasonings() {
		return seasonings;
	}
	public void setSeasonings(String seasonings) {
		this.seasonings = seasonings;
	}
	public int getBacon_quantity() {
		return bacon_quantity;
	}
	public void setBacon_quantity(int bacon_quantity) {
		this.bacon_quantity = bacon_quantity;
	}
	public int getSausage_quantity() {
		return sausage_quantity;
	}
	public void setSausage_quantity(int sausage_quantity) {
		this.sausage_quantity = sausage_quantity;
	}

}
