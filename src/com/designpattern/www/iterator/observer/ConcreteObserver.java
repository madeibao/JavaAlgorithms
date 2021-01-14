package com.designpattern.www.iterator.observer;

/**
 * @ClassName ConcreteObserver
 * @Author：Mayuan
 * @Date 2020/11/18 15:32
 * @Description TODO
 * @Version 1.0
 **/
public class ConcreteObserver implements Observer {

    private String name;
    private String message;


    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }


    public void read() {
        System.out.println(name + " 收到消息：" + message);
    }
}
