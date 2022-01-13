package javaQ;

import java.sql.*;
public class Q32 {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bca";
			String un = "root";
			String pw ="";
			Connection c = DriverManager.getConnection(url,un,pw);
			insert(c);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void insert(Connection c)throws SQLException{
		Statement stat = c.createStatement();
		
		String query = "insert into Student (rollno,name, course) values (1,'kisim', 'BCA')";
		stat.execute(query);
		System.out.println("record inserted");
	}
}
