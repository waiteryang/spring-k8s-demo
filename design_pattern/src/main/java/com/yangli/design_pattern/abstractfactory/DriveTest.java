package com.yangli.design_pattern.abstractfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 抽象工厂模式是为了让创建工厂和一组产品与使用相分离
 */
public class DriveTest {

    public static void main(String[] args) {
        AbstractCarFactory factory = new CarAFactory();
        factory.createA();
        //factory.createB();

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        //一个接口只有一个抽象方法，那么就默认为函数式接口

        list = list.stream().map(factory::handleList).collect(Collectors.toList());
        System.out.println(list);
    }
}
