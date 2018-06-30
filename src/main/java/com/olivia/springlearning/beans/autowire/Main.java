package com.olivia.springlearning.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
        Person person = (Person) ctx.getBean("person7");
        System.out.println(person);
    }
}
