package com.basicinnerclass.www;

/**
 * @ClassName Demo2
 * @Author：Mayuan
 * @Date 2021/5/8/0008 21:39
 * @Description TODO
 * @Version 1.0
 **/
/**
 * 局部内部类
 */
public class Demo2 {

    //将内部类定义在方法中
    public void show() {
        final String name = "Tom";
        class Student{
            int id = 20;
            public void show() {
                System.out.println("外部类方法变量:" + name);
                System.out.println("内部类属性变量:" + id);
            }
        }
        Student student = new Student();
        student.show();
    }

    /**
     *     将内部类定义在作用域内
     */

    public void display(int num) {
        if(num > 2) {
            class Person{
                int age = 18;
                public void show() {
                    System.out.println("age = " + age);
                }
            }
            Person person = new Person();
            person.show();
        }
        else {
            System.out.println("None");
        }
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.show();
        demo2.display(3);
    }
}