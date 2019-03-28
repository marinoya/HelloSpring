package edu.progress.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Hello helloObject = (Hello) context.getBean("helloID");

        System.out.println(helloObject.getMessage());

    }
}
