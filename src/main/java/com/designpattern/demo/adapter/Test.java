package com.designpattern.demo.adapter;

public class Test {
    public static void main(String[] args) {
        ITarget target = new ConnectTarget();
        target.request();

        ITarget adapterTarget = new Adapter();
        adapterTarget.request();
    }
}

