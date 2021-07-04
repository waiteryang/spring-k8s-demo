package com.yangli.design_pattern.test;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Staff {

//    public Staff(String name, Integer age, String extra) {
//        this.name = name;
//        this.age = age;
//        this.extra = extra;
//    }

    public String name;

    public int age;

    public String extra;

}
