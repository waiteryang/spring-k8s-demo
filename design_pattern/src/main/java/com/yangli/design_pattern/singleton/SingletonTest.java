package com.yangli.design_pattern.singleton;

/**
 * 单例测试类
 *
 * @author yangli
 * <p>
 * 单例的特点
 * 1.单例只有一个实例对象
 * 2.该单例对象必须由该类创建
 * 3.单例对外提供一个单例的全局访问点
 * <p>
 * 应用场景
 * 1.在应用场景中，某类只要求生成一个对象的时候，如一个班中的班长，每个人的身份证号等
 * 2.当对象需要被共享的场合，由于单例模式只允许创建一个对象，共享该对象可以节省内存，并加快对象访问速度。如web中的配置对象，数据库的连接池等。
 * 3.当某类需要频繁实例化，而创建的对象又频繁被销毁的时候，如多线程的线程池、网络连接池等
 */
public class SingletonTest {


    /**
     *
     */
    public static void main(String[] args) {


        for (int i = 0; i < 10000L; i++) {

            new Thread(()->{
                try {
                    System.out.println(LazySingleton.getInstance1().hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }



        // 我们JDK中，java.lang.Runtime就是经典的单例模式(饿汉式)
        Runtime.getRuntime();


    }


}
