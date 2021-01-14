package com.datastructure.www.treesettest2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * @ClassName ConsumeTimeTest
 * @Author：Mayuan
 * @Date 2020/3/9 11:41
 * @Description TODO
 * @Version 1.0
 * <p>
 * 各个部分内容的耗时的对比。
 * <p>
 * HashSet: 1544313
 * TreeSet: 2066049
 * LinkedHashSet: 629826
 * 虽然测试不够准确,但能反映得出，TreeSet要慢得多,因为它是有序的。
 **/
public class ConsumeTimeTest {

    public static void main(String[] args) {

        Random r = new Random();
        HashSet<Dog> hashSet = new HashSet<Dog>();
        TreeSet<Dog> treeSet = new TreeSet<Dog>();
        LinkedHashSet<Dog> linkedSet = new LinkedHashSet<Dog>();

        // start time
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            hashSet.add(new Dog(x));
        }

        // end time
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("HashSet: " + duration);

        // start time
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            treeSet.add(new Dog(x));
        }
        // end time
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("TreeSet: " + duration);

        // start time
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            linkedSet.add(new Dog(x));
        }

        // end time
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedHashSet: " + duration);
    }
}
