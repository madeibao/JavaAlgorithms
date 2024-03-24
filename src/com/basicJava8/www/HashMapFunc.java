package com.basicJava8.www;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName HashMapFunc
 * @Author：Mayuan
 * @Date 2020/8/20 15:40
 * @Description TODO
 * @Version 1.0
 * hashmap的方法的重写
 **/

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public String toString() {
        return "{" + name + "," + age + "}";
    }

    // 下面是重写hashcode的代码：
    public int hashCode() {
        return name.hashCode() + age * 10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            throw new ClassCastException("类型不匹配算法");
        }
        Person p = (Person) obj;
        return this.name.equals(p.getName()) && this.age == p.getAge();
    }

}

public class HashMapFunc {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet();
        set.add(new Person("张三", 21));
        set.add(new Person("李四", 19));
        set.add(new Person("王五", 22));
        set.add(new Person("张三", 21));
        sop(set);
    }

    private static void sop(HashSet<Person> set) {
        Iterator<Person> it = set.iterator();
        while (it.hasNext()) {
            Person p = it.next();
            System.out.println(p.toString());
        }
    }
}
