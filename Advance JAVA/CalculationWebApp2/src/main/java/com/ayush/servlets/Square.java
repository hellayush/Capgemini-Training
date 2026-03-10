package com.ayush.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Square
 */
@WebServlet("/Square")
public class Square extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Square() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String s=request.getParameter("num");
	       int n=Integer.parseInt(s);
	       PrintWriter out= response.getWriter();
	       out.println("<!DOCTYPE html>");
	       out.println("<html>");
	       out.println("<head>");
	       out.println("<title>Square Page</title>");
	       out.println("</head>");
	       out.println("<body>");
	       out.println("<h3>Square:</h3>");
	       out.println("<p>Square of "+n+" = "+n*n+" </p>");
	       out.println("</body>");
	       out.println("</html>");
	       out.close();
	}

}
