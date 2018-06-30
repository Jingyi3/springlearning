package com.olivia.springlearning.beans.relation;

import com.olivia.springlearning.beans.autowire.Address;
import com.olivia.springlearning.beans.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
        Address address = (Address) ctx.getBean("address2");
        System.out.println(address);

        address = (Address) ctx.getBean("address3");
        System.out.println(address);

        Person person = (Person) ctx.getBean("person9");
        System.out.println(person);
    }
}
