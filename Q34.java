package javaQ;

import java.sql.*;

public class Q34 {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bca";
			String un = "root";
			String pw ="";
			Connection cn = DriverManager.getConnection(url,un,pw);
			updateAll(cn);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	private static void updateAll(Connection cn) throws SQLException {
		Statement stat = cn.createStatement(); // statment create

		String query = "update student set course = 'BA'";
		stat.executeUpdate(query); // execute query

		System.out.println("Record updated!");
		}
}
