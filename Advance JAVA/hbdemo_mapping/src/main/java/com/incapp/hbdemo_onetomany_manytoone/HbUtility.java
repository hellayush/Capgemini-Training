package com.incapp.hbdemo_onetomany_manytoone;


import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HbUtility {
	public static SessionFactory geSessionFactory() {
		Configuration cfg=new Configuration();
	       
        Properties p=new Properties();
        p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		p.put(Environment.URL, "jdbc:mysql://localhost:3306/book_hbdb");
		p.put(Environment.USER, "root");
		p.put(Environment.PASS, "WJ28@krhps");
		p.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		p.put(Environment.HBM2DDL_AUTO, "create");//Create new Tables if does not exist.
        
		cfg.setProperties(p);
        cfg.addAnnotatedClass(Book.class); //Create a Book table in Database
        cfg.addAnnotatedClass(Author.class); //Create a Author table in Database
        return cfg.buildSessionFactory();
	}
}
