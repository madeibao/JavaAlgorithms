package com.basicJava8.www;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName FunctionTest
 * @Author Mayuan
 * @Date 2025/10/18/星期六 20:53
 * @Version 1.0
 **/
public class FunctionTest {
    static class Student {
        int id;
        int age;
        String name;

        public Student(int id, int age, String name) {
            this.id = id;
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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, 12, "aa");
        Student a2 = new Student(2, 11, "ac");
        Student a3 = new Student(3, 12, "acd");
        Student a4 = new Student(4, 12, "ab");
        Student a5 = new Student(5, 12, "abc");

        List<Student> list = new ArrayList<Student>();
        list.add(a);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        // 多级排序
        list.sort(Comparator
                .comparing(Student::getAge)        // 先按年龄排序
                .thenComparing(Student::getName)   // 再按姓名排序
        );
        // 反向排序
        list.sort(Comparator.comparing(Student::getName).reversed());
        // 使用不同的比较方式
        list.sort(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));

        for (var j : list) {
            System.out.println(j.getId() + " " + j.getName() + " " + j.getAge());
        }
    }
}
