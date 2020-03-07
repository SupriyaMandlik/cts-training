package com.cts;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ramk")
public class MyServlet extends HttpServlet {
@Override
public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	super.init(config);
	System.out.println("from init--gets called only once");
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.println("from service---gets called multiple times");
		
	}
@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("from destroy----its get called only once--always");
	}
 }
