package Databaseautomatiomysql.Databaseautomatiomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDataToSql {

	 public static void main(String[] args) throws Exception {
		  Connection con=null;
		  String dbUrl="jdbc:mysql://localhost:3306/test_schema?useSSL=true";
		  String driver="com.mysql.cj.jdbc.Driver";
		  String userName="root";
		  String password="sql@12!";
		  
		  
		 Class.forName(driver).newInstance();
		 con=DriverManager.getConnection(dbUrl,userName,password);
	     System.out.println("Connection established successfully");
	     
	     PreparedStatement ps=con.prepareStatement("INSERT into books(idbooks,bookname,author,category,released)VALUES('006','The Great Gatsby','F. Scott Fitzgerald','Classic','1')");
	     
	     ps.executeUpdate();
	     
	 con.close();

	 }
}
