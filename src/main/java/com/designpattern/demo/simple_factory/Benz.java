package com.designpattern.demo.simple_factory;

@Vehicle(type = "Benz")
public class Benz implements Car {
    private String name;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void drive() {
        System.out.println("奔驰让你在车盖上哭");
    }
}
