package com.designpattern.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.SocketPermission;
import java.util.*;

public class JdkProxyTest {

    public static void main(String[] args) {
//        ISubject subject =  new Subject();
//        InvocationHandler handler = new SubjectProxyHandler(subject.getClass());
////        newProxyInstance，方法有三个参数：
////        loader: 用哪个类加载器去加载代理对象【代理对象】
////        interfaces:动态代理类需要实现的接口
////        h:动态代理方法在执行时，会调用h里面的invoke方法去执行【代理类中的增强方法】
//        ISubject proxy =
//                (ISubject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
//                        subject.getClass().getInterfaces(), handler);
//        proxy.action();
//        System.out.println("--------------------");
//        proxy.action1();
//        System.out.println("--------------------");
//        proxy.action2();
//        System.out.println("--------------------");
//        proxy.action3();
         //固定接口模板
//        ISubject subject = new Subject2();
//        InvocationHandler invocationHandler = new WorkHandler(subject.getClass());
//        ISubject proxyInstance =  (ISubject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),invocationHandler);
//        proxyInstance.action();
//        proxyInstance.action1();
//
//        //底层是Hash,存取无序的 元素不能有重复
//        HashSet<String> hashSet = new HashSet<>();
//        //存储无序，元素不能重复，可以自行排序
//        List<String> workOrderList = new ArrayList<>();
//        workOrderList.add("1");
//        workOrderList.add("2");
//        workOrderList.add("3");
//        List<String> testList = new ArrayList<>();
//        testList.add("1");
//        testList.add("2");
//        testList.add("3");
//        boolean b = workOrderList.removeAll(testList);
//        System.out.println(b);
//        System.out.println(workOrderList);
//        Boolean b = null;
//        System.out.println(b);
//        System.out.println(Optional.ofNullable(b).orElse(false));
//        Set<String> set = new HashSet<>();



    }
}
