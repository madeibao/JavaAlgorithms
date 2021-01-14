package com.autil.www;

/**
 * @ClassName Student
 * @Author：Mayuan
 * @Date 2020/10/18 15:36
 * @Description TODO
 * @Version 1.0
 **/
public class Student {
    private int age;
    private String name;
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Student(String name, int age, int snum) {
        this.name = name;
        this.age = age;
        this.num = snum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", snum=" + num +
                '}';
    }
}
