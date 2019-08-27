package com.designpattern.demo.build;

public class Director {
    public void Construct(CarBuild builder){
        builder.buildWheel().buildEngine().buildCarBody().buildTank();
    }


}
