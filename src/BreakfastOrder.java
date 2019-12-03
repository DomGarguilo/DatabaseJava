
public class BreakfastOrder extends Order {
	
	private int pancake_quantity;
	private int fried_egg_quantity;
	private boolean omlette; //false = no omlette & vise versa
	private boolean scrambled_eggs; //false = no omlette & vise versa
	private String ingredients;
	private String seasonings;
	private int bacon_quantity;
	private int sausage_quantity;
	
	

	public BreakfastOrder(int orderID, int customer, int pancake_quantity, int fried_egg_quantity, boolean omlette, boolean scrambled_eggs,
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
	public boolean isOmlette() {
		return omlette;
	}
	public void setOmlette(boolean omlette) {
		this.omlette = omlette;
	}
	public boolean isScrambled_eggs() {
		return scrambled_eggs;
	}
	public void setScrambled_eggs(boolean scrambled_eggs) {
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
