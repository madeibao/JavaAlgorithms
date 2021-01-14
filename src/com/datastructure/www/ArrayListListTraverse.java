package com.datastructure.www;

import java.util.ArrayList;

/**
 * @program: Pro1->ArrayList2Traverse
 * @description: 二级链表的相互的访问
 * @author: MaYuan
 * @create: 2019-12-23 19:00
 * @version: 1.0
 **/
public class ArrayListListTraverse {
    /**
     * 二级列表的访问过程。
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>();
        for (ArrayList<Integer> array : list3) {
            for (Integer s : array) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
