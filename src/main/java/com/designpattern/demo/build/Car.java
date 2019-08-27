package com.designpattern.demo.build;

import java.util.ArrayList;
import java.util.List;

public class Car {
    //车组件的集合
    private List<String> parts = new ArrayList<String>();

    public void Add(String part){
        parts.add(part);
    }

    public void Show(){
        for (int i = 0;i<parts.size();i++){
            System.out.println("组件"+parts.get(i)+"装好了");
        }
        System.out.println("车组装好了");
    }
}
