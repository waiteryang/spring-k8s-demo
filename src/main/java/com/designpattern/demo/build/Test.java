package com.designpattern.demo.build;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuild builder = new CarBuilder();
        director.Construct(builder);
        Car car = builder.getCar();
        car.Show();
    }
}
