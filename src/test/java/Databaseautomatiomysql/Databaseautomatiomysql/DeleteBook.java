package Databaseautomatiomysql.Databaseautomatiomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DeleteBook {
   
	 public static void main(String[] args) {
	        Connection con = null;
	        PreparedStatement ps = null;

	        String dbUrl = "jdbc:mysql://localhost:3306/test_schema?useSSL=false";
	        String driver = "com.mysql.cj.jdbc.Driver";
	        String userName = "root";
	        String password = "sql@12!";

	        try {
	            Class.forName(driver);
	            con = DriverManager.getConnection(dbUrl, userName, password);
	            System.out.println("Connection established successfully");
	            String sql = "DELETE FROM books WHERE idbooks = ?";
	            ps = con.prepareStatement(sql);
	            ps.setString(1, "006");

	            int rowsAffected = ps.executeUpdate(); 
	            System.out.println("Rows affected: " + rowsAffected);

	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("Error occurred.");
	        } finally {
	            try {
	                if (ps != null) ps.close();
	                if (con != null) con.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	                System.out.println("Error closing resources.");
	            }
	        }
	    }
}
