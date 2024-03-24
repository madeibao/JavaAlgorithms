package com.datastructure.www;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @ClassName TreeSetTest
 * @Author：Mayuan
 * @Date 2020/6/1 21:51
 * @Description TODO
 * @Version 1.0
 * <p>
 * 集合的算法
 **/
public class TreeSetTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>(new StrComparator());
        while (s.hasNextLine()) {
            int n = Integer.parseInt(s.nextLine());
            for (int i = 0; i < n; i++) {
                String string = s.nextLine();
                set.add(string);
            }
            for (String s1 : set) {
                System.out.println(s1);
            }
            set.clear();
        }
        s.close();
    }
}

class StrComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        if (s1.compareTo(s2) <= 0) {
            return -1;
        }
        return 1;
    }
}