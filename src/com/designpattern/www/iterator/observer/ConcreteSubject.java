package com.designpattern.www.iterator.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteSubject
 * @Author：Mayuan
 * @Date 2020/11/18 15:31
 * @Description TODO
 * @Version 1.0
 **/

/**
 * 定义实现主题
 **/
public class ConcreteSubject implements Subject {
    private List<Observer> list;
    private String message;

    public ConcreteSubject() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }


    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()) {
            list.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public void send(String s) {
        this.message = s;
        System.out.println("更新消息:" + s);
        //消息更新，通知所有观察者
        notifyObservers();
    }
}
