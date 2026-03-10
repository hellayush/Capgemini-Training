package com.incapp.hbdemo_onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Insert 
{
    public static void main( String[] args )
    {
    	SessionFactory factory=HbUtility.geSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        
        
        Author a=new Author();
        a.setName("Priya Tyagi");
        a.setAge(22);
        a.setCity("Delhi");
        
        Book book=new Book();
        book.setName("ML");
        book.setPrice(800);
        book.setAuthor(a);
        session.persist(a);//optional in the case of CascadeType
        session.persist(book);
        transaction.commit();
        System.out.println("Success!");
        session.close();
    }
}
