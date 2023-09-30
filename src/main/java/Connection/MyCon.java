package Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class MyCon {

	public static  Connection  dbcon() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/resell?characterEncoding=UTF-8";
		Connection con=(Connection) DriverManager.getConnection(url,"root","q1w2e3r4");

		//Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/resell", "root","q1w2e3r4");
			Statement stmt = con.createStatement();

		String accountSQL = "CREATE TABLE IF NOT EXISTS account (" +
				"id INT AUTO_INCREMENT PRIMARY KEY," +
				"name VARCHAR(100) NOT NULL," +
				"user VARCHAR(50) NOT NULL," +
				"mob VARCHAR(15) NOT NULL," +
				"email VARCHAR(100) NOT NULL," +
				"pass VARCHAR(100) NOT NULL" +
				")";

		String productSQL = "CREATE TABLE IF NOT EXISTS product (" +
				"id INT AUTO_INCREMENT PRIMARY KEY," +
				"type VARCHAR(50) NOT NULL," +
				"title VARCHAR(100) NOT NULL," +
				"brand VARCHAR(50) NOT NULL," +
				"price DECIMAL(10, 2) NOT NULL," +
				"summary VARCHAR(255) NOT NULL," +
				"cond VARCHAR(50) NOT NULL," +
				"Name VARCHAR(100) NOT NULL," +
				"Email VARCHAR(100) NOT NULL," +
				"num VARCHAR(15) NOT NULL," +
				"city VARCHAR(50) NOT NULL" +
				")";

			stmt.executeUpdate(accountSQL);
			stmt.executeUpdate(productSQL);
			System.out.println("Created table in given database...");
			return con;



}
	
}

