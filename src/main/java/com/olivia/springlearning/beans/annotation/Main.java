package com.olivia.springlearning.beans.annotation;

import com.olivia.springlearning.beans.annotation.controller.UserController;
import com.olivia.springlearning.beans.annotation.repository.UserRepositoryImpl;
import com.olivia.springlearning.beans.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
//        TestObject to = (TestObject) ctx.getBean("testObject");
//        System.out.println(to);
//
//        UserController uc = (UserController) ctx.getBean("userController");
//        System.out.println(uc);
//
//        UserService userService = (UserService) ctx.getBean("userService");
//        System.out.println(userService);

        UserRepositoryImpl userRepository = (UserRepositoryImpl) ctx.getBean("userRepository");
        System.out.println(userRepository);
    }
}
