package javaQ;
import java.sql.*;
public class Q36 {
	public static void main(String[]args) {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/bca";
		String un = "root";
		String pw = "";
		Connection cn = DriverManager.getConnection(url,un,pw);
		deleteAll(cn);
		}catch(Exception e){
		System.out.println(e);
		}

	}
		private static void deleteAll(Connection cn) throws SQLException {
		Statement stat = cn.createStatement(); // statment create

		String query = "delete from student";
		stat.executeUpdate(query); // execute query

		System.out.println("All Record deleted!");
		}
}

