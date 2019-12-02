import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		final String ID = "dgargu1";
		final String PW = "Cosc*ad35";
		final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/"+ID+"db";
		
		try {
			Connection con = DriverManager.getConnection(SERVER, ID, PW);
			Statement stmt = con.createStatement();
			System.out.println("Connected Succesfully");
			
			System.out.println("")
			
			ResultSet rs = stmt.executeQuery("Select * from dgargu1db.Department");
			System.out.println("After query");

			
			while (rs.next()) {
				String dName = rs.getString("DNAME");
				String dNO = rs.getString("DNUMBER");
				String mgrSSN = rs.getString("MGRSSN");
				String mgrDate = rs.getString("MGRSTARTDATE");
				System.out.println(dName+", "+dNO+", "+mgrSSN+", "+mgrDate);
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
	}
}
