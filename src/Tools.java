import java.sql.ResultSet;
import java.sql.SQLException;

public class Tools {

	public Tools() {
		// TODO Auto-generated constructor stub
	}
	
	//checks if in stock
	public static boolean getIngredientStatus(String ingr) {
		boolean result = false;
		String q = "SELECT status FROM dgargu1db.ingredient WHERE name = '" + ingr + "'";
		ResultSet rs = QueryClass.query(q);
		
		try {
			while (rs.next()) {
				int temp = Integer.parseInt(rs.getString("status"));
				if(temp == 1) {
					//System.out.println("In stock");
					result = true;
				} else if(temp == 0) {
					//System.out.println("Out of stock");
				} else {
					System.out.println("Error in ingr status. expected 1 or 0. Tools java");
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static void setIngredientStatus(String ingr, boolean bool) {
		boolean temp = getIngredientStatus(ingr);
		int num = -1;
		if(bool) {
			num = 1;
		} else {
			num = 0;
		}
		String q = "UPDATE dgargu1db.ingredient SET status=" + num + " WHERE name='" + ingr + "'";
		if(!(temp == bool)) {
			QueryClass.update(q);
			System.out.println("Updated");
		}
	}

}
