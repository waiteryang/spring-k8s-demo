package com.designpattern.demo.decorator;

public class Decorator {
    public static void main(String[] args) {
        ISubject subject = new Subject();
        subject = new SubjectPreDecorator(subject);
        subject = new SubjectPostDecorator(subject);
        subject.action();
    }
}
