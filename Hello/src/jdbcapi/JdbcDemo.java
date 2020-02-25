package jdbcapi;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
import java.sql.Driver;

public class JdbcDemo {
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//1.Load database Driver
		//1.1 By using forName method
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//1.2
		
		//Driver driver=new com.mysql.jdbc.Driver();
		
		//2. Establish the connection
		
		String url="jdbc:mysql://localhost:3306/ctspune";
	   java.sql.Connection conn=DriverManager.getConnection(url,"root","ROOT");
	   
	   //execute sql queries
	   
	   java.sql.Statement stmt=conn.createStatement();
	// String query="insert into employee values(5,'sam','mumbai',24,8747454)";
	// String query="update employee set address='Thane' where id=4";
   // String query="delete from employee where id=2";
	   String query="select * from employee";
	   ResultSet rs = stmt.executeQuery(query);
	   while(rs.next())
	   {
		   int id=rs.getInt(1);
		   String name=rs.getString(2);
		   String address=rs.getString(3);
		   int age=rs.getInt(4);
		   long phone=rs.getLong(5);
		  // System.out.println(id+":"+name+":"+address+":"+age+":"+phone);
		   System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4)+":"+rs.getInt(5)); 
	   }
	  
	  /*int result= stmt.executeUpdate(query);
	   if (result>0) {
		   System.out.println("record inserted successfully");
		  
	   }else {
		   System.out.println("something went wrong");
	   }*/
	   
	   
	}

}
