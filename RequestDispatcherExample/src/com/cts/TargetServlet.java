package com.cts;


	import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
	import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/TargetServlet")
	public class TargetServlet extends HttpServlet{
			 @Override
			 protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException ,IOException {
				System.out.println("from doGetof TargetServlet");
	String customerName=(String)req.getAttribute("customerName");
	Integer term=(Integer)req.getAttribute("noOfYears");
	Integer premiumAmount=(Integer)req.getAttribute("amount");
				
	double sumAssured=(premiumAmount*term)+(premiumAmount*term)*50/100;
	System.out.println("amount after maturity=="+sumAssured);
	PrintWriter pw=resp.getWriter();
	pw.write("<h1>your paid amount &nbsp;&nbsp"+sumAssured+"</h1>");
			}
			
		
	}


