package com.autil.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Test
 * @Author：Mayuan
 * @Date 2020/10/18 15:39
 * @Description TODO
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        List<Student> stus = new ArrayList<Student>() { {
                add(new Student("张三", 30, 1));
                add(new Student("李四", 20, 2));
                add(new Student("王五", 40, 3));
                add(new Student("赵六", 30, 4));
                add(new Student("陈七", 40, 5));
                add(new Student("周八", 20, 6));
            }
        };

        Collections.sort(stus, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                int flag;
                // 首选按年龄升序排序
                flag = s1.getAge() - s2.getAge();
                if (flag == 0) {
                    // 再按学号升序排序
                    flag = s1.getNum() - s2.getNum();
                }
                return flag;
            }
        });

        System.out.println("年龄 学号 姓名  ");
        for (Student s : stus) {
            System.out.println(s.getAge() + "   " + s.getNum() + "   " + s.getName());
        }
    }
}
