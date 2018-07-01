package com.olivia.springlearning.beans.cycle;

public class Car {
    public Car() {
        System.out.println("car's constructor...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("setBrand...");
    }

    public void init() {
        System.out.println("init...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public void destory() {
        System.out.println("destory...");
    }
    private String brand;

}
