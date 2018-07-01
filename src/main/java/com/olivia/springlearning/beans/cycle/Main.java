package com.olivia.springlearning.beans.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cycle.xml");
        Car car = (Car) ctx.getBean("car");

        System.out.println(car);

        //封闭IOC容器
        ctx.close();
    }
}
