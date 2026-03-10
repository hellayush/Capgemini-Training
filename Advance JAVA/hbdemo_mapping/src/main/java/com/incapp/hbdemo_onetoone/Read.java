package com.incapp.hbdemo_onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Read 
{
    public static void main( String[] args )
    {
    	SessionFactory factory=HbUtility.geSessionFactory();
        Session session=factory.openSession();
        
        Book b = session.get(Book.class, 1);
        if (b != null) {
            System.out.println(b);
            System.out.println(b.getAuthor());
        } else {
            System.out.println("No Book found ");
        }

        Author a = session.get(Author.class, 1);
        if (a != null) {
            System.out.println(a);
        } else {
            System.out.println("No Author found ");
        }
        session.close();
    }
}
