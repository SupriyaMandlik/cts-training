package com.cts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieHandler1
 */
@WebServlet("/CookieHandler1")
public class CookieHandler1 extends HttpServlet {

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String creditCardNo=req.getParameter("creditCardNo");
    	String password=req.getParameter("password");
    	Cookie cookie=new Cookie(creditCardNo, password);
    	cookie.setMaxAge(24*365*7);
	    resp.addCookie(cookie);
	    RequestDispatcher rd=req.getRequestDispatcher("/CookieHandler2");
	    rd.forward(req,resp);
	}

}
