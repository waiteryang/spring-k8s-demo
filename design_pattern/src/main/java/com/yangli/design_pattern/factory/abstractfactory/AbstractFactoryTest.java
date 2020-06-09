package com.yangli.design_pattern.factory.abstractfactory;


/**
 * 将工厂抽象成两层，AbsFactory(抽象工厂)和具体实现的工厂子类。
 * <p>
 * 1，抽象工厂模式隔离了具体类的生产，使得客户并不需要知道什么时候被创建
 * 2.当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象
 * 3.增加新的具体工厂和产品族很方便，无需修改已有系统，符合开闭原则
 */
public class AbstractFactoryTest {


    public static void main(String[] args) {

        AbstractCarFactory factory = new CarFactoryA();
        factory.createA();
    }

}
