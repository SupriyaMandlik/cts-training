package employeedatabase;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class FormSubmit extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("in init");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String n = request.getParameter("userName");
		String p = request.getParameter("userPass");
		String e = request.getParameter("userEmail");
		String d = request.getParameter("userDesignation");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sup", "root", "ROOT");

			PreparedStatement ps = con.prepareStatement("insert into registeruser1 values(?,?,?,?)");

			ps.setString(1, n);
			ps.setString(2, p);
			ps.setString(3, e);
			ps.setString(4, d);

			int i = ps.executeUpdate();
			if (i > 0)
				System.out.println("You are successfully registered...");

		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
		catch(SQLException e3)
		{
			e3.printStackTrace();
		}
	}
	

	
	}

