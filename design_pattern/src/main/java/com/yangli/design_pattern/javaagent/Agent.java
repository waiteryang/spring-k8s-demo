package com.yangli.design_pattern.javaagent;


import java.lang.instrument.Instrumentation;

/**
 * java agent 技术学习
 *
 * @author yangli
 */
public class Agent {

    public static void premain(String args, Instrumentation inst) {

        System.out.println("Hi, This is a agent!");
        //将类转换器添加到此`agent`的`instrumentation`实例之中
        inst.addTransformer(new TestTransformer());
    }

}
