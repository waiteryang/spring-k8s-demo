package com.yangli.design_pattern.abstractfactory;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 实际的工厂A
 */
public class CarAFactory implements AbstractCarFactory {

    @Override
    public void createA() {
        System.out.println("创建产品");
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list = new ArrayList<>();
        System.out.println(list.stream().map(this::handleList).collect(Collectors.toList()));
    }

    @Override
    public void createB() {
        System.out.println("创建B产品");
    }

    @Override
    public String handleList(String x) {
        System.out.println(x);
        return "xx";
    }

}
