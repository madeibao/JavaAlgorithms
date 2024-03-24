package com.designpattern.www.iterator.singleinstance;

/**
 * @ClassName SingleObject
 * @Author：Mayuan
 * @Date 2020/10/16 20:49
 * @Description TODO
 * @Version 1.0
 **/
public class SingleObject {

    /**
     *     创建 SingleObject 的一个对象
     */

    private static SingleObject instance = new SingleObject();

    /**
     *     让构造函数为 private，这样该类就不会被实例化，私有的函数只能类的内部来进行使用。
     */

    private SingleObject() {}

    //获取唯一可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}

