package com.basicinnerclass.www;

/**
 * @ClassName Demo3
 * @Author：Mayuan
 * @Date 2021/5/8/0008 21:41
 * @Description TODO
 * @Version 1.0
 **/
/**
 * 匿名内部类
 * 匿名内部类，顾名思义，就是没有名字的内部类。正因为没有名字，所以匿名内部类只能使用一次，
 * 它通常用来简化代码编写。但使用匿名内部类还有个前提条件：必须继承一个父类或实现一个接口
 */
public class Demo3 {

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        // 匿名内部类 -> 类继承
        new Animal() {
            public void say() {
                System.out.println("Say");
            }
        }.say();
        // 匿名内部类 -> 接口实现
        new Fruit(){
            public void eat() {
                System.out.println("apple");
            }
        }.eat();
    }

}

class Animal{
    public void say() {
        System.out.println("Animal say");
    }
}

interface Fruit{
    void eat();
}