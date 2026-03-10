package com.ayush.firstapp;

import com.ayush.firstapp.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         Employee e1 = new Employee();
         e1.setName("Ram Kumar");
         e1.setSalary(56000);
         e1.setCname("ABC");
         System.out.println(e1);
//         System.out.println("Name : " + e1.getName() + "CName : " + e1.getCname() +" Salary : " + e1.getSalary());
         
         
         Employee e2 = new Employee("Tina Singh" , "PQR" , 78000);
         System.out.println("Name : " + e2.getName());
         System.out.println("CName : " + e2.getCname());
         System.out.println("Salary : " + e2.getSalary());
         
    }
    
}
