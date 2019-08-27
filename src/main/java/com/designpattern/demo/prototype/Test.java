package com.designpattern.demo.prototype;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.setName("xh");
        List<String> ids = new ArrayList<>();
        ids.add("a");
        ids.add("b");
        ids.add("c");
        prototype.setIds(ids);
        Prototype clone = prototype.clone();
        System.out.println(clone);
        System.out.println(prototype);
        System.out.println(clone.getName());
        System.out.println(clone.getIds().size());
        System.out.println(clone.getIds());
        System.out.println(prototype.getIds());

        System.out.println(clone.getName()==prototype.getName());
    }
}
