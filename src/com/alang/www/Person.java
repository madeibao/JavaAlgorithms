package com.alang.www;

/**
 * @ClassName Person
 * @Author：Mayuan
 * @Date 2020/10/18 15:27
 * @Description TODO
 * @Version 1.0
 * <p>
 * 实现了这个接口之后来进行的修
 **/
public class Person implements Comparable<Person> {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Person o) {
        // 这里是一个强制的类型的转换。
        Person p = (Person) o;
        return  p.age - o.age;
    }
}
