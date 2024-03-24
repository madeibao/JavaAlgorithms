package com.algorithm.www;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName NumberRemove
 * @Author：Mayuan
 * @Date 2020/5/31 17:26
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数字的移除然后比较大小。
 **/

public class NumberRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        List<Character> list = new ArrayList();
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    if (Integer.valueOf(list.get(j + 1).toString()) > Integer.valueOf(list.get(j).toString())) {
                        //移除
                        list.remove(j);
                        //i回退
                        i--;
                        break;
                    } else {
                        //移除
                        list.remove(i);
                        //i回退
                        i--;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}