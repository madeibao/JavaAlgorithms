package com.sort.www.sort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName SortDemo
 * @Author：Mayuan
 * @Date 2020/10/14 8:46
 * @Description TODO
 * @Version 1.0
 **/

public class SortDemo {
    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<>();
        //创建并添加到stuList第一个学生
        Student stu1 = new Student();
        stu1.setName("小涂");
        stu1.setAge(23);
        stuList.add(stu1);


        //创建并添加到stuList第二个学生
        Student stu2 = new Student();
        stu2.setName("小刘");
        stu2.setAge(21);
        stuList.add(stu2);


        //创建并添加到stuList第三个学生
        Student stu3 = new Student();
        stu3.setName("小王");
        stu3.setAge(25);
        stuList.add(stu3);

        // 添加学生列表内容，并且实现自定义的排序。
        System.out.println("排序前的stuList集合：");
        for (Student student : stuList) {
            System.out.print(student.getName() + student.getAge() + " ");
        }

        //实现Comparator进行排序
        Collections.sort(stuList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Student) o2).getAge() - ((Student) o1).getAge();
            }
        });

        System.out.println();
        System.out.println("按照年龄降序排序后的stuList集合：");
        for (Student student : stuList) {
            System.out.print(student.getName() + student.getAge() + " ");
        }
    }
}