package com.designpattern.demo.adapter;

public class ConnectTarget implements ITarget {
    @Override
    public void request() {
        System.out.println("正常链接目标");
    }
}
