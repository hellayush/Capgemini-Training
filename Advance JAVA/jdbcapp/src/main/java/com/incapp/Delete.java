package com.incapp;
import java.sql.*;

public class Delete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","incapp");
			Statement st=c.createStatement();
			//int r=st.executeUpdate("DELETE FROM employee WHERE id=10");
			//int r=st.executeUpdate("DELETE FROM employee WHERE salary<80000");
//			int r=st.executeUpdate("DELETE FROM employee WHERE salary<80000 and cname='ABC'");
			int r=st.executeUpdate("DELETE FROM employee WHERE salary<80000 or cname='ABC'");
			if(r==0) {
				System.out.println("Data Not FOUND!");
			}else {
				System.out.println("Data Deleted Successfully!");
			}
			c.close();
	       } catch (ClassNotFoundException | SQLException e) {
	           e.printStackTrace();
	       }
	}

}
