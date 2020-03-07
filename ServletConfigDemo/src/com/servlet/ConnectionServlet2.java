package com.servlet;

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Connection;


public class ConnectionServlet2 extends HttpServlet {
	   String user,password,url,driver;
	   Connection conn;
	   ServletContext context;
	   @Override
	   public void init (ServletConfig config) throws ServletException {
	   	context=config.getServletContext();
	   	user=context.getInitParameter("userName");
	      password=context.getInitParameter("password");
	      url=context.getInitParameter("url");
	      driver=context.getInitParameter("driver");
	      try {
	   	   Class.forName(driver);
	   	   conn=(Connection) DriverManager.getConnection(url,user,password);
	   	   System.out.println(conn);
	   	   System.out.println(config+"from cs2");
	   	   System.out.println(context+"from cs2");
} catch(Exception e) {
	e.printStackTrace();
}
}
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("hello from service()");
}
}
