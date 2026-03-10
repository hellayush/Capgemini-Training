package com.ayush.Hbproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        //cfg.configure();//by default search for hibernate.cfg.xml
        cfg.configure();
        cfg.addAnnotatedClass(Product.class); // Create a Product table in Database
        
        SessionFactory factory = cfg.buildSessionFactory();
        // Connected with data base
        System.out.println(factory);
        
    }
}
