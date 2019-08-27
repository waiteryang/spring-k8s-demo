package com.designpattern.demo.abstract_factory;

import com.designpattern.demo.simple_factory.Vehicle;

@Vehicle(type = "AuDi")
public class AuDi implements Car {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void drive() {
        System.out.println("奥迪四个圈，不哭不闹");
    }
}
