package com.olivia.springlearning.beans.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ZJYYY on 2018/6/30.
 */
public class Main {

    public static void main(String[] args) {
/*        //传建一个helloword对象
        HelloWorld helloWorld = new HelloWorld();
        //为name属性赋值
        helloWorld.setName("Bob");*/

        //1. 创建Spring的IOC容器对象
        //ApplicationContext 代表IOC容器
        //ClassPathXmlApplicationContext： 是ApplicationContext接口的实现类，该实现类从类路径下来加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2. 从IOC容器中获取Bean实例
        HelloWorld helloWorld =(HelloWorld) ctx.getBean("helloWorld");
        //利用id定位到IOC容器中的Bean，要求IOC容器中必须只能有一个该类型的Bean
//        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);


        //调用hello方法
        //helloWorld.hello();

        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        car = (Car) ctx.getBean("car2");
        System.out.println(car);

        Person person = (Person) ctx.getBean("person2");
        System.out.println(person);



    }
}
