package com.basicinnerclass.www;

/**
 * @ClassName Demo
 * @Author：Mayuan
 * @Date 2021/5/8/0008 21:36
 * @Description TODO
 * @Version 1.0
 *
 * 局部内部类
 *
 **/
public class Demo {

    private String name = "Tom";

    /**
     *  定义一个成员内部类，作为成员变量
     */
    class Student{
        private int age = 20;
        private String name = "Jack";

        public void show() {
            System.out.println("内部类属性；" + name);
            System.out.println("内部类属性：" + age);
            System.out.println("外部类属性：" + Demo.this.name);
        }
    }

    public static void main(String[] args) {
        //声明一个外部类对象
        Demo demo = new Demo();
        //声明一个内部类对象
        Student student = demo.new Student();
        student.show();
    }
}