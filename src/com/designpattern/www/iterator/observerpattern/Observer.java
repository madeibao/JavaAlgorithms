package com.designpattern.www.iterator.observerpattern;

/**
 * @ClassName Observer
 * @Author：Mayuan
 * @Date 2020/7/8 16:07
 * @Description TODO
 * @Version 1.0
 **/
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
