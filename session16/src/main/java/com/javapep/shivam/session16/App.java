package com.javapep.shivam.session16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javapep.bean.connection.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Connection  c1 = new Connection();
        
        ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
        
//        Connection c1 = (context) getBean()
        
        System.out.println(c1);
        System.out.println(context);
    }
}
