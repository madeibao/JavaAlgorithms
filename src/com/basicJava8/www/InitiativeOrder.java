package com.basicJava8.www;

/**
 * @ClassName InitiativeOrder
 * @Author：Mayuan
 * @Date 2020/11/19 20:33
 * @Description TODO
 * @Version 1.0
 * <p>
 * 类的初始化的顺序
 * <p>
 * java继承中的初始化顺序
 * 初始化顺序：
 * 父类的静态变量-->父类的静态代码块-->子类的静态变量-->子类的静态代码快-->父类的非静态变量(父类的非静态代码块)-->父类的构造函数-->子类的非静态变量（子类的非静态代码块）-->子类的构造函数
 * <p>
 * 值得注意的是：父类的非静态变量(父类的非静态代码块)是同一级的，看哪个部分写在类的最前面谁就先被执行，子类的非静态变量（子类的非静态代码块）也是一样。###
 **/


class Parent {
    public static PrintMessage a = new PrintMessage("父类静态成员被初始化");
    private PrintMessage b = new PrintMessage("父类非静态成员被初始化");

    static {
        System.out.println("父类的静态代码块被执行");
    }

    {
        System.out.println("父类的非静态代码块被执行");
    }

    public Parent() {
        System.out.println("父类的构造方法被执行");
    }
}

class Child extends Parent {
    public static PrintMessage a1 = new PrintMessage("子类静态成员被初始化");
    private PrintMessage b1 = new PrintMessage("子类非静态成员被初始化");

    static {
        System.out.println("子类的静态代码块被执行");
    }

    {
        System.out.println("子类的非静态代码块被执行");
    }

    public Child() {
        System.out.println("子类的构造函数被执行");
    }
}

class PrintMessage {
    public PrintMessage(String mes) {
        System.out.println(mes);
    }
}

public class InitiativeOrder {

    public static void main(String[] args) {
        Child c = new Child();

    }
}
