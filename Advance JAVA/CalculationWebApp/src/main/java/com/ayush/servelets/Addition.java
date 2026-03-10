package com.ayush.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Addition implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	String s1 =	arg0.getParameter("num1");
	String s2 =	arg0.getParameter("num2");
	 int n1 =Integer.parseInt(s1);
	 int n2 =Integer.parseInt(s2);
	 int n = n1+n2;
	  PrintWriter out =arg1.getWriter();
	  out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Add Page</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h3>Addition:</h3>");
      out.println("<p>Sum of "+n1+" and "+n2+" = "+n+" </p>");
      out.println("</body>");
      out.println("</html>");
      out.close();
		
	}
	
}
