package com.ayush.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayush.springapp.beans.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Book b2 = new Book();
//        b2.setName("Java");
//        b1.setPrice(500);
//        b1.setAname("Ayush");
//        
//        b1.setPname("Invapp");
//        System.out.println(b1);
//        Book b2 = new Book("Python" , 600 , "HElo" , "incapp");
//        System.out.println(b2);
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ayush.xml");
        //Searchin for mappin for b1 in ayush.xml
        Book book1 = (Book)ctx.getBean("b1");
        System.out.println(book1);
    }
}
