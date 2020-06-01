package com.yangli.design_pattern.strategy;

public class Context {


    public AbstractStrategy strategy;

    public Context(AbstractStrategy strategy){
        this.strategy = strategy;
    }

    //上下文接口
    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
