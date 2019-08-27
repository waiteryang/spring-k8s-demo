package com.designpattern.demo.MyTest;


/**
 * 被代理类
 */
public class SuperMan implements  IHuman {
    @Override
    public String getBelief() {
        return  "我相信我会飞";
    }

    @Override
    public void eat(String food) {
       System.out.println("我是超人类,我喜欢吃思创");
    }
}
