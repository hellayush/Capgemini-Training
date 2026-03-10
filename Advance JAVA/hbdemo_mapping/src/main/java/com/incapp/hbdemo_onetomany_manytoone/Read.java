package com.incapp.hbdemo_onetomany_manytoone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Read 
{
    public static void main( String[] args )
    {
    	SessionFactory factory=HbUtility.geSessionFactory();
        Session session=factory.openSession();
        
        Book b= session.get(Book.class,1);
        System.out.println(b);
        System.out.println(b.getAuthor());
        List<Author> authors=b.getAuthor();
        for(Author a:authors) {
        	System.out.println(a);
        }
        
        Author a=session.get(Author.class, 1);
        System.out.println(a);
        System.out.println(a.getBook());
        session.close();
    }
}
