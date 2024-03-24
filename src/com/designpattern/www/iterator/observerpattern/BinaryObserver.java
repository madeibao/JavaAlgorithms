package com.designpattern.www.iterator.observerpattern;

/**
 * @ClassName BinaryObserver
 * @Author：Mayuan
 * @Date 2020/7/8 16:08
 * @Description TODO
 * @Version 1.0
 **/
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    public void update() {

    }
}
