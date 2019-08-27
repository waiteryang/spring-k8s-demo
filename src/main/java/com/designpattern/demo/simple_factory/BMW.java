package com.designpattern.demo.simple_factory;

@Vehicle(type = "BMW")
public class BMW implements Car {
    private String name;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void drive() {
        System.out.println("宝马让你在车里面哭");
    }
}
