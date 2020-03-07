package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SorceServlet")
	public class SorceServlet extends HttpServlet{
		 @Override
protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException {
	System.out.println("from doGetof sourceservlet");
String custName=req.getParameter("customerName");
 int term=Integer.parseInt(req.getParameter("term"));
 int premiumamount=Integer.parseInt(req.getParameter("premium"));
 req.setAttribute("customerName", custName);
req.setAttribute("noOfYears",term);
req.setAttribute("amount",premiumamount);
System.out.println("your paid amount=="+(premiumamount*term));
PrintWriter pw=resp.getWriter();
pw.write("<h1>your paid amount &nbsp;&nbsp"+(premiumamount*term)+"</h1>");
  resp.sendRedirect("https://www.w3schools.com/quiztest/quiztest.asp?qtest=HTML");
 // RequestDispatcher dispatcher=req.getRequestDispatcher("/http://localhost:8080/FirstWebApp1/Welcome.html");
			   //dispatcher.include(req,resp);
		}
		
	
}
