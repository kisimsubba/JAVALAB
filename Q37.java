package javaQ;
import java.sql.*;
public class Q37 {
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
		Statement stat = cn.createStatement(); // statement create

		String query = "select * from Student";
		System.out.println("Reading records...");
		ResultSet rst = stat.executeQuery(query); // execute query
		while(rst.next()) {
		System.out.print("RollNO: "+rst.getString("rollno"));
		System.out.print(" Name: "+rst.getString("name"));
		System.out.print(" Course: "+rst.getString("course"));
		System.out.println("\n");
		}
	}
}

