package com.incapp.hbdemo_onetomany_manytoone;

import java.util.ArrayList;
import java.util.List;

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
        
        
        Author a1=new Author();
        a1.setName("Priya Tyagi");
        a1.setAge(22);
        a1.setCity("Delhi");
        Author a2=new Author();
        a2.setName("Ram Kumar");
        a2.setAge(20);
        a2.setCity("Noida");
        Author a3=new Author();
        a3.setName("Rakesh Singh");
        a3.setAge(23);
        a3.setCity("Meerut");
        
        Book book=new Book();
        book.setName("ML");
        book.setPrice(800);
        a1.setBook(book);
        a2.setBook(book);
        a3.setBook(book);
        List<Author> a=new ArrayList<>();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        book.setAuthor(a);
        session.persist(a1);//optional in the case of CascadeType
        session.persist(a2);//optional in the case of CascadeType
        session.persist(a3);//optional in the case of CascadeType
        session.persist(book);
        transaction.commit();
        System.out.println("Success!");
        session.close();
    }
}
