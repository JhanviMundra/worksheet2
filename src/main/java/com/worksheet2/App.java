package com.worksheet2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/worksheet2/configW2.xml");
		Student student1=context.getBean("student1",Student.class);
		System.out.println(student1);
		
    }
}
