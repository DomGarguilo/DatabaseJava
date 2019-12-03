
public class PastaOrder extends Order {
	
	private String pastaType;
	private String sauceType;
	private String ingredients;
	private String seasonings;

	public PastaOrder(int orderID, int customer, String pastaType, String sauceType, String ingredients, String seasonings) {
		super(orderID, customer);
		this.setPastaType(pastaType);
		this.setSauceType(sauceType);
		this.setIngredients(ingredients);
		this.setSeasonings(seasonings);
	}
	
	
	//getters and setters
	public String getPastaType() {
		return this.pastaType;
	}

	public void setPastaType(String pastaType) {
		this.pastaType = pastaType;
	}

	public String getSauceType() {
		return this.sauceType;
	}

	public void setSauceType(String sauceType) {
		this.sauceType = sauceType;
	}

	public String getIngredients() {
		return this.ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getSeasonings() {
		return this.seasonings;
	}

	public void setSeasonings(String seasonings) {
		this.seasonings = seasonings;
	}



}
