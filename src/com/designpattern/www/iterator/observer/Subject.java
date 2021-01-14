package com.designpattern.www.iterator.observer;

/**
 * @ClassName Subject
 * @Author：Mayuan
 * @Date 2020/11/18 15:30
 * @Description TODO
 * @Version 1.0
 **/

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}
