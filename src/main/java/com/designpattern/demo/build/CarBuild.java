package com.designpattern.demo.build;

public interface CarBuild {
    /**轮子*/
    public CarBuild buildWheel();
    /**引擎*/
    public CarBuild buildEngine();
    /**车身*/
    public CarBuild buildCarBody();
    /**油箱*/
    public CarBuild buildTank();
    /**车装好了*/
    public Car getCar();
}
