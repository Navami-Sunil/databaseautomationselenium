

package Databaseautomatiomysql.Databaseautomatiomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryDataFromsql {
  public static void main(String[] args) throws Exception {
	  Connection con=null;
	  String dbUrl="jdbc:mysql://localhost:3306/test_schema?useSSL=true";
	  String driver="com.mysql.cj.jdbc.Driver";
	  String userName="root";
	  String password="sql@12!";
	  
	  
	 Class.forName(driver).newInstance();
	 con=DriverManager.getConnection(dbUrl,userName,password);
     System.out.println("Connection established successfully");

     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select * from books");
     
     while(rs.next()) {
    	 System.out.println("Booknames:"+ rs.getString("bookname"));
     }
     rs.close();
  
  }
}
