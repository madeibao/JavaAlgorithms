package com.sort.www.sort2;

/**
 * @ClassName Student
 * @Author：Mayuan
 * @Date 2020/10/14 8:44
 * @Description TODO
 * @Version 1.0
 * <p>
 * 实现自定义的排序结果值。
 **/
public class Student {

    // 姓名
    private String name;
    // 年龄
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
