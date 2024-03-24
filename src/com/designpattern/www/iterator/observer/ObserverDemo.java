package com.designpattern.www.iterator.observer;

/**
 * @ClassName ObserverDemo
 * @Author：Mayuan
 * @Date 2020/11/18 15:32
 * @Description TODO
 * @Version 1.0
 **/
public class ObserverDemo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("张三");
        Observer observer2 = new ConcreteObserver("李四");
        Observer observer3 = new ConcreteObserver("王五");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);


        subject.send("今天加班");


        subject.removeObserver(observer1);
        subject.send("明天放假");
    }

}
