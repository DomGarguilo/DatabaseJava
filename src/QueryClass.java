import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryClass {

	public QueryClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static ResultSet query(String q) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		final String ID = "dgargu1";
		final String PW = "Cosc*ad35";
		final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/" + ID + "db";

		try {
			Connection con = DriverManager.getConnection(SERVER, ID, PW);
			Statement stmt = con.createStatement();
			System.out.println("Connected Succesfully");

			System.out.println("");

			ResultSet rs = stmt.executeQuery(q);
			System.out.println("After query");
			/*
			while (rs.next()) {
				String id = rs.getString("ID");
				String un = rs.getString("UserName");
				String type = rs.getString("type");

				System.out.println(id + ", " + un + ", " + type);
			}
			*/
			return rs;
		} catch (SQLException e) {
			System.err.println(e);
		}
		return null;
	}

}
