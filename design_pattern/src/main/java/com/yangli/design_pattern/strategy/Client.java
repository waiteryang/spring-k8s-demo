package com.yangli.design_pattern.strategy;


/**
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的context对象。策略对象改变context对象的执行算法。
 *
 * 主要解决:在有多种算法相似的情况下，使用if...else所带来的复杂和难以维护
 * 如何解决:将这些算法封装成一个一个的类，任意地替换
 * 关键代码:实现同一个接口
 *
 * 优点:1.算法可以自由切换。 2.避免使用多重条件判断 3.扩展性良好
 * 缺点:1.策略类会增多。2.所有的策略类都需要对外暴露
 * @author yangli
 */
public class Client {

    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }

}
