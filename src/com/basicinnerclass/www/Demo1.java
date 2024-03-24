package com.basicinnerclass.www;

/**
 * @ClassName Demo1
 * @Author：Mayuan
 * @Date 2021/5/8/0008 21:38
 * @Description TODO
 * @Version 1.0
 **/


public class Demo1 {
    private String name = "static";

    private static int id = 2019;
    static class Student {
        int id = 11;
        public void show() {
            System.out.println("外部类成员变量:" + (new Demo1().name));
            System.out.println("外部类静态成员:" + Demo1.id);
            System.out.println("内部类成员变量:" + id);
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.show();
    }
}