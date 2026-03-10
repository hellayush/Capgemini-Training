package com.incapp.hbdemo_onetoone_bi;

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
        
        Author a=session.get(Author.class, 1);
        System.out.println(a);
        System.out.println(a.getBook());
        session.close();
    }
}
