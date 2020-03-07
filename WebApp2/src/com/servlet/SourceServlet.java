package com.servlet;

import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

public class SourceServlet extends HttpServlet {

	@Override
protected void service(HttpServletRequest req,HttpServletResponse resp)throws ServletException{
		 System.out.println("hello from source servlet");
		 String url="jdbc:mysql://localhost:3306/ctspune";
		 try {
		      Connection conn=(Connection) DriverManager.getConnection(url,"root","ROOT");
		      System.out.println("from init");
		 }catch(Exception e) {
		 	e.printStackTrace();
		 }
		 System.out.println("connection established");
		 	}
		 
		 
	}
	

