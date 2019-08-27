package com.designpattern.demo.proxy;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.omg.CORBA.portable.InvokeHandler;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.beans.Statement;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProxyTest {

    public  Object instance;

    private static int x=100;

    public static void main(String[] args) {

        ISubject subject = new ProxySubject();
        InvocationHandler invocationHandler = new  SubjectProxyHandler(subject.getClass());
        ISubject proxy = (ISubject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),invocationHandler);
        proxy.action();
//        proxy.action1();
//        proxy.action2();
//        proxy.action3();
////        ISubject subject = new ProxySubject();
////        subject.action();
//
//        ProxyTest p1 = new ProxyTest();
//        ProxyTest p2 = new ProxyTest();
//
////        p1.instance = p2;
//////        p2.instance = p1;
//
//        p1 = null;
//        p2 = null;
//        System.gc();
//        ProxyTest hs1=new ProxyTest();
//        hs1.x++;
//        ProxyTest  hs2=new ProxyTest();
//        hs2.x++;
//        hs1.x++;
//        ProxyTest.x--;
//        System.out.println("x="+x);
//        double i = 4.0;
//        double j = 3.6;
//        double t = i-j;
//        System.out.println("t="+t);
//        //线程不安全
//        StringBuilder stringBuilder = new StringBuilder();
//
//        Object o = new Object();
//
//        Collections.synchronizedList(new ArrayList<>());
//
//        //线程安全
//        StringBuffer stringBuffer = new StringBuffer();
//        TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add("张三10");
//        treeSet.add("张三2");
//        treeSet.add("张三3");
//        treeSet.add("张三2");
//        treeSet.add("张三1");
//        treeSet.forEach(c->{
//            System.out.println(c);
//        });
//        ConcurrentHashMap<String,Object> concurrentHashMap = new ConcurrentHashMap<>();
//        concurrentHashMap.put("","");
//        HashMap<String,Object> map = new HashMap<>();
//        map.put("","");
//
//        Lock lock = new ReentrantLock();
//          Vector<Person> vector = new Vector<>();
//          while (true){
//              Person person = new Person("张三","李四");
//              vector.add(person);
//          }
        //InitializingBean
        //DisposableBean
        //BeanNameAware
        //BeanFactoryAware
        //BeanPostProcessor
    }

    public static class  Person{

        public Person(String name,String address){
                this.name = name;
                this.address = address;
        }

        public String name;

        public String getName() {
            return name;
        }

        public String address;

        public String getAddress() {
            return address;
        }
    }
}
