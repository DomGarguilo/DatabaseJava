import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPage {
		
	public static void login(int num) {
		if(isCustomer(num)) {
			System.out.println("Custmer ID found");
		} else if (isEmployee(num)) {
			System.out.println("Employee ID found");
		} else {
			System.out.println("Invalid ID");
		}
		
	}
	
	//tests if the input int is customer 
	public static boolean isCustomer(int num) {
		boolean result = false;
		try {
						
			String query = "SELECT * FROM dgargu1db.login";
			ResultSet rs = QueryClass.query(query);
					
			//loops through query
			while (rs.next()) {
				//if id matches and is customer type
				if(Integer.parseInt(rs.getString("ID")) == num && Integer.parseInt(rs.getString("type")) == 1) {
					System.out.println("Customer ID detected from isCustomer()");
					result = true;
				}				
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		return result;
	}
	
	public static boolean isEmployee(int num) {
		boolean result = false;
		try {
	
			String query = "SELECT * FROM dgargu1db.login";
			ResultSet rs = QueryClass.query(query);
			
			//loops through query
			while (rs.next()) {
				//if id matches and is customer type
				if(Integer.parseInt(rs.getString("ID")) == num && Integer.parseInt(rs.getString("type")) == 0) {
					System.out.println("Employee ID detected from isEmployee()");
					result = true;
				}				
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		return result;
	}
}
