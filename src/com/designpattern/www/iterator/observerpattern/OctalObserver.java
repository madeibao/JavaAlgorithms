package com.designpattern.www.iterator.observerpattern;

/**
 * @ClassName OctalObserver
 * @Author：Mayuan
 * @Date 2020/7/8 16:09
 * @Description TODO
 * @Version 1.0
 **/
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
