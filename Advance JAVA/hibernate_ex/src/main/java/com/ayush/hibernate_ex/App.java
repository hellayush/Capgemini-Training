package com.ayush.hibernate_ex;

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
        Configuration c = new Configuration();
        c.configure();
        c.addAnnotatedClasses(Teacher.class);
        
        SessionFactory se = c.buildSessionFactory();
        System.out.println(se);
    }
}
