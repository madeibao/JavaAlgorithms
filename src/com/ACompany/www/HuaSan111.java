package com.ACompany.www;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName HuaSan111
 * @Author：Mayuan
 * @Date 2020/11/9 9:00
 * @Description TODO
 * @Version 1.0
 * 三个最大的数字和三个最小的数字来组成的最大的差值。
 **/
public class HuaSan111 {
    private static int sub(String input) {

        String[] values = input.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (String value : values) {
            if (Integer.parseInt(value) < 0 || Integer.parseInt(value) > 9) {
                return -1;
            }
            list.add(Integer.parseInt(value));
            list2.add(Integer.parseInt(value));
        }

        Collections.sort(list);
        Collections.sort(list2, Collections.reverseOrder());

        int max = list2.get(0) * 100 + list2.get(1) * 10 + list2.get(2);
        int min = 0;
        if (list.get(1) == 0 && list.get(2) != 0) {
            min = list.get(2) * 100 + list.get(1) * 10 + list.get(0);
        } else {
            min = list.get(1) * 100 + list.get(0) * 10 + list.get(2);
        }
        return max - min;
    }

    public static void main(String[] args) {
        String str = "1 0 3 5 2 7";
        System.out.println(sub(str));
    }
}
