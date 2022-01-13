package javaQ;
import java.sql.*;
public class Q38 {
	public static void main(String[] args){
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/bca";
		String un = "root";
		String pw = "";
		Connection cn = DriverManager.getConnection(url,un,pw);
		display(cn);
		}catch(Exception e){
		System.out.println(e);
		}
	}

		private static void display(Connection cn) throws SQLException {
		Statement stat = cn.createStatement(); 
		
		String query = "select name from student";
		System.out.println("Reading records...");
		
		ResultSet rs = stat.executeQuery(query); 
		while(rs.next()) {
		
		System.out.print(" Name: "+rs.getString("name"));

		System.out.println("\n");
		}
	}
}

