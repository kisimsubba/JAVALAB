package javaQ;

import java.sql.*;
public class Q31 {
	public Connection getConnection() {
		try {
			String url="jdbc:mysql://localhost:3306/bca";
			String username="root";
			String password="";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn= DriverManager.getConnection(url,username,password);
			System.out.println("connected");
			return cn;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		Q31 n = new Q31();
		n.getConnection();
	}
 }
