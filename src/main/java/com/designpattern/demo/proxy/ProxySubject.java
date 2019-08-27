package com.designpattern.demo.proxy;

public class ProxySubject implements ISubject {
    private Subject subject;

    public ProxySubject() {
        subject = new Subject();
    }
    @Override
    public void action() {
        preAction();
        subject.action();
        postAction();
    }

    @Override
    public void action1() {
        preAction();
        subject.action1();
        postAction();
    }

    @Override
    public void action2() {
        preAction();
        subject.action2();
        postAction();
    }

    @Override
    public void action3() {
        preAction();
        subject.action3();
        postAction();
    }

    private void preAction() {
        System.out.println("ProxySubject.preAction()");
    }

    private void postAction() {
        System.out.println("ProxySubject.postAction()");
    }


}
