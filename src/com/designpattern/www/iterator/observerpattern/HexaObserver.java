package com.designpattern.www.iterator.observerpattern;

/**
 * @ClassName HexaObserver
 * @Author：Mayuan
 * @Date 2020/7/8 16:09
 * @Description TODO
 * @Version 1.0
 **/
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
