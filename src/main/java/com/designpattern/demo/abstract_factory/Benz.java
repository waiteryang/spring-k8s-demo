package com.designpattern.demo.abstract_factory;

import com.designpattern.demo.simple_factory.Vehicle;

@Vehicle(type = "Benz")
public class Benz implements Car {
    private String name;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void drive() {
        System.out.println("你想做奔驰盖上哭的美女吗？");
    }
}
