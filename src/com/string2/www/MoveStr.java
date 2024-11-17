package com.string2.www;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 字符串的左右移动
 *
 * @ClassName MoveStr
 * @Author：Mayuan
 * @Date 2024/11/16/星期六 17:14
 * @Description TODO
 * @Version 1.0
 **/
public class MoveStr {

    public static String stringShift(String s, int[][] shift) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(s.split("")));
        for (int[] temp : shift) {
            int direction = temp[0];
            int cnt = temp[1];
            // 向左面移动，去除前面的，插入到后面
            if (direction == 0) {
                for (int i = 0; i < cnt; i++) {
                    String temp2 = list.removeFirst();
                    list.addLast(temp2);
                }
            } else {
                for (int i = 0; i < cnt; i++) {
                    String temp2 = list.removeLast();
                    list.addFirst(temp2);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s2 : list) {
            sb.append(s2);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "abc";
        int[][] shift = new int[][]{{0,1},{1,2}};
        System.out.println(stringShift(s, shift));

    }
}
