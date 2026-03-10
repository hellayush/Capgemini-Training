package com.ayush.book123;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayush.book123.beans.book124;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Ayush.xml");
        //Searchin for mappin for b1 in Ayush.xml
        book124 book1 = (book124)ctx.getBean("b1");
        System.out.println(book1);
        book124 book2 = ctx.getBean("b2",book124.class);
        System.out.println(book1);
        book124 book3 = (book124)ctx.getBean("b1");
        System.out.println(book3);
    }
}
