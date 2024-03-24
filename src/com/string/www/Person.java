package com.string.www;

/**
 * @ClassName Person
 * @Author：Mayuan
 * @Date 2020/5/9 20:44
 * @Description TODO
 * @Version 1.0
 * <p>
 * 条件排序。
 **/

import java.util.Set;
import java.util.TreeMap;

class Person implements Comparable<Person> {
    int age;
    String name;

    public Person() {

    }

    public Person(int age, String name) {
        super();
        this.age = age;
        this.name = name;
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

    /**
     按照年龄的方法来进行排序。
     */
    @Override
    public int compareTo(Person p) {
        if (this.age > p.age) {
            return 1;
        } else if (this.age < p.age) {
            return -1;
        }
        return age;
    }

    public static void main(String[] args) {
        // Person p1 = new Person(18, "mayuan");
        // Person p2 = new Person(19,"tony");
        // Person p3 = new Person(20,"bog");

        TreeMap<Person, String> pdata = new TreeMap<Person, String>();

        pdata.put(new Person(18, "mayuan"), "马");
        pdata.put(new Person(19, "tom"), "汤");
        pdata.put(new Person(20, "bob"), "鲍");
        pdata.put(new Person(21, "lisa"), "李");

        Set<Person> name = pdata.keySet();

        for (Person p : name) {
            System.out.println(p.getAge() + " " + p.getName());
        }

    }
}