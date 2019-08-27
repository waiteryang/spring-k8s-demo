package com.designpattern.demo.adapter;

public class Adapter implements ITarget{
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request(){
        System.out.println("转接头");
        adaptee.onRequest();
    };
}
