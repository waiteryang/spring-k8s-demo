package com.designpattern.demo.build;

public class CarBuilder implements CarBuild {

    Car car = new Car();

    @Override
    public CarBuild buildWheel() {
        car.Add("车轮");
        return this;
    }

    @Override
    public CarBuild buildEngine() {
        car.Add("引擎");
        return this;
    }

    @Override
    public CarBuild buildCarBody() {
        car.Add("车身");
        return this;
    }

    @Override
    public CarBuild buildTank() {
        car.Add("油箱");
        return this;
    }

    @Override
    public Car getCar() {
        return car;
    }
}
