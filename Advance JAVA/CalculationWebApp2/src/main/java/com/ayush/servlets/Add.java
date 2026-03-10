package com.ayush.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Add
 */
@WebServlet("/sum")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("num1");
	       String s2=request.getParameter("num2");
	       int n1=Integer.parseInt(s1);
	       int n2=Integer.parseInt(s2);
	       int n=n1+n2;
	       PrintWriter out= response.getWriter();
	       out.println("<!DOCTYPE html>");
	       out.println("<html>");
	       out.println("<head>");
	       out.println("<title>Add Page</title>");
	       out.println("</head>");
	       out.println("<body>");
	       out.println("<h3>Addition:</h3>");
	       out.println("<p>Sum of "+n1+" and "+n2+" = "+n+" </p>");
	       out.println("<hr/><p>"+getServletInfo()+"</p>");
	       out.println("<hr/><p>"+getServletConfig()+"</p>");
	       out.println("</body>");
	       out.println("</html>");
	       out.close();
	}

}
