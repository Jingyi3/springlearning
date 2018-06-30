package com.olivia.springlearning.beans.basic;

/**
 * Created by ZJYYY on 2018/6/30.
 */
public class HelloWorld {
    private String name;

    public void setName2(String name) {
        System.out.println("setName: "+name);
        this.name = name;
    }

    public void hello() {
        System.out.println("hello: " + name);
    }

    public HelloWorld() {
        System.out.println("constructor...");
    }

}
