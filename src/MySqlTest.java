import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MySqlTest {
	public static void main(String[] args) throws SQLException {
		
		
		String q = "SELECT * FROM dgargu1db.pasta";
		ResultSet rs = QueryClass.query(q);
		
		while (rs.next()) {
			String order = rs.getString("order_num");
			String ID = rs.getString("cust_ID");
			String pasta = rs.getString("pasta_type");
			String sauce = rs.getString("sauce_type");
			String ingr = rs.getString("ingredients");
			String seas = rs.getString("seasonings");

			System.out.println(order + ", " + ID + ", " + pasta + ", " + sauce + ", " + ingr + ", " + seas);
		}
		
		String u = "INSERT INTO `dgargu1db`.`pasta` (`order_num`, `cust_ID`, `pasta_type`, `sauce_type`, `ingredients`, `seasonings`) "
				+ "VALUES (1224, 1212121, 'bowtie', 'marinara', 'onion, mushroom', 'old_bay, cajun');";
		QueryClass.update(u);
		rs = QueryClass.query(q);
		
		while (rs.next()) {
			String order = rs.getString("order_num");
			String ID = rs.getString("cust_ID");
			String pasta = rs.getString("pasta_type");
			String sauce = rs.getString("sauce_type");
			String ingr = rs.getString("ingredients");
			String seas = rs.getString("seasonings");

			System.out.println(order + ", " + ID + ", " + pasta + ", " + sauce + ", " + ingr + ", " + seas);
		}
		
		
		/*
		System.out.println("ENter id");
		Scanner scan = new Scanner(System.in);
		int tempID = scan.nextInt();
		scan.close();
		LoginPage.login(tempID);
		*/

	}

}
