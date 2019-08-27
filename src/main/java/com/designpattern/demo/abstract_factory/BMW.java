package com.designpattern.demo.abstract_factory;

import com.designpattern.demo.simple_factory.Vehicle;

@Vehicle(type = "BMW")
public class BMW implements Car {
    private String name;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void drive() {
        System.out.println("做梦都想坐在宝马上哭");
    }
}
