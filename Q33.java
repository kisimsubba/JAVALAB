package javaQ;

import java.sql.*;

public class Q33 {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bca";
			String un = "root";
			String pw ="";
			Connection cn = DriverManager.getConnection(url,un,pw);
			update(cn);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	private static void update(Connection cn) throws SQLException {
		Statement stat = cn.createStatement(); // statement create
		String query = "update student set Course = 'BIT' where Name = 'Sajay'";
		stat.executeUpdate(query); // execute query
		System.out.println("Record updated!");
		}
}
	
