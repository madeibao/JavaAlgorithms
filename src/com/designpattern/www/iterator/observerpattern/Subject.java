package com.designpattern.www.iterator.observerpattern;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName Subject
 * @Author：Mayuan
 * @Date 2020/7/8 16:07
 * @Description TODO
 * @Version 1.0
 **/
public class Subject {
    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
