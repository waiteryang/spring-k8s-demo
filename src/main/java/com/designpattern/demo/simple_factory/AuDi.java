package com.designpattern.demo.simple_factory;

@Vehicle(type = "AuDi")
public class AuDi implements Car {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void drive() {
        System.out.println("奥迪暂时不会让你哭");
    }
}
