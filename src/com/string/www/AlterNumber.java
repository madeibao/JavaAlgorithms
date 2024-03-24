package com.string.www;

import java.util.Scanner;

/**
 * @ClassName AlterNumber
 * @Author：Mayuan
 * @Date 2020/5/15 21:45
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 改变数字
 * 美团2020.3.26笔试算法
 * <p>
 * -12
 * 2 3 7 6 5 4 3 2 1
 **/
public class AlterNumber {

    public static void main(String[] args) {
        //主要判断前面有无加减号，并且有，序号下标就差一个对应需要考虑哈
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.nextLine();
            //in.nextLine();
            String str = in.nextLine();
            String[] string = str.split(" ");
            //in.close();
            StringBuffer sb = new StringBuffer();
            boolean flag = false;
            {
                if (a.charAt(0) == '+' || a.charAt(0) == '-')
                    sb.append(a.charAt(0));
                flag = true;
            }
            int n = a.length();
            if (flag) {
                n = n - 1;
            }
            for (int i = 0; i < n; i++) {
                sb.append(string[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
