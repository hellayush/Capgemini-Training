package com.incapp;
import java.sql.*;

public class Insert_Mysql {

	public static void main(String[] args) {
		try {
	           Class.forName("com.mysql.cj.jdbc.Driver"); //Driver Connect and load 
	           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","WJ28@krhps"); // Connection Get  -- > with the localhost , root and sql password
	           PreparedStatement p = c.prepareStatement("INSERT INTO employee (name,salary,cname,address) VALUES (?,?,?,?)"); // --> Create object 
	           p.setString(1, "e104");
	           p.setInt(2, 78000);
	           p.setString(3,"abc");
	           p.setString(4,"qwerty");
	           p.executeUpdate();
	           c.close();
	           System.out.println("Success");
	       } catch (ClassNotFoundException | SQLException e) {
	           e.printStackTrace();
	       }
	}

}
