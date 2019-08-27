package com.designpattern.demo.decorator;

public class SubjectPostDecorator implements ISubject{
    private ISubject subject;

    public SubjectPostDecorator(ISubject subject) {
        this.subject = subject;
    }

    private void postAction() {
        System.out.println("SubjectPostDecorator.postAction()");
    }

    @Override
    public void action() {
        subject.action();
        postAction();
    }
}
