package com.olivia.springlearning.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MybeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization： " + bean + "," + beanName);

        if ("car".equals(beanName)) {
            //...
        }

        return bean;
        //返回原生的bean
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization： " + bean + "," + beanName);
        Car car = new Car();
        car.setBrand("Ford");
        return car;
    }
}
