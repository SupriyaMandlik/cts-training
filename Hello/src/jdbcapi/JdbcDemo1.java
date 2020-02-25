package jdbcapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo1 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException,IOException
	{
	/*BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter employee id");
	int id=Integer.parseInt(br.readLine());
	System.out.println("enter employee name");
	String name=br.readLine();
	System.out.println("enter employee address");
	String address=br.readLine();
	System.out.println("enter employee age");
	int age=Integer.parseInt(br.readLine());
	System.out.println("enter employee phone no");
	long phone=Long.parseLong(br.readLine());*/
	
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/ctspune";
    Connection conn=DriverManager.getConnection(url,"root","ROOT");
	//String query="insert into employee values(?,?,?,?,?)";	
	//String query="update employee set name=? where id=?";	
	//String query="delete from employee where id=?";
	String query="select * from employee";
    PreparedStatement ps= conn.prepareStatement(query);	
   
	ResultSet rs=ps.executeQuery(query);
    while(rs.next())
	   {
		   int id1=rs.getInt(1);
		   String name1=rs.getString(2);
		   String address1=rs.getString(3);
		   int age1=rs.getInt(4);
		   long phone1=rs.getLong(5);
		//  System.out.println(id+":"+name+":"+address+":"+age+":"+phone);
		   System.out.println(rs.getInt(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getInt(4)+"\n"+rs.getInt(5)); 
	   }
	
	//ps.setString(1, name);
	//ps.setInt(1,id);
		
	/*int result=ps.executeUpdate();
	if(result>0) {
		System.out.println("data inserted successfully");
	}else {
		System.out.println("try again");
	}*/
  }
}
