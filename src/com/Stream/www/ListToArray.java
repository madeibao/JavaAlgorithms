package com.Stream.www;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ListToArray
 * @Author：Mayuan
 * @Date 2025/2/23/星期日 18:30
 * @Description TODO
 * @Version 1.0
 **/
public class ListToArray {

    public static int[] toArray(List<Integer> list) {
        return list.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int[] res = toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int j : res) {
            System.out.print(j + " ");
        }
    }
}
