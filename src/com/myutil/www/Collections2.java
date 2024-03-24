package com.myutil.www;

/**
 * @program: Pro1->Collections2
 * @description: Java的collections的操作内容
 * @author: MaYuan
 * @create: 2019-12-23 19:37
 * @version: 1.0
 **/

import java.util.*;

public class Collections2 {
    public static void main(String[] args) {
        // create vector object
        //动态增长的数据内容。
        Vector<String> vector = new Vector<String>();

        // populate the vector
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("5");
        System.out.println("Before swap: " + vector);
        // swap the elements
        //第一个下标索引，第二个下标索引。
        Collections.swap(vector, 0, 4);
        System.out.println("After swap: " + vector);
    }
}


