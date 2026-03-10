package com.ayush.hibernate_ex;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateUtility {

    public static SessionFactory getSessionFactory() {
        Configuration cfg = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hb_db");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "Incapp@12");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put(Environment.SHOW_SQL, true);
        properties.put(Environment.FORMAT_SQL, true);

        cfg.setProperties(properties);
        cfg.addAnnotatedClass(Teacher.class); 

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties()).build();

        SessionFactory factory = cfg.buildSessionFactory(serviceRegistry);
        return factory;
    }
}
