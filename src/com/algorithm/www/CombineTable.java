package com.algorithm.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName CombineTable
 * @Author：Mayuan
 * @Date 2020/3/27 22:24
 * @Description TODO
 * @Version 1.0
 * <p>
 * 组合两个表的结构
 * 题目描述
 * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * <p>
 * 输入描述:
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 * <p>
 * 输出描述:
 * 输出合并后的键值对（多行）
 * <p>
 * 示例1
 * 输入
 * 复制
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * 输出
 * 复制
 * 0 3
 * 1 2
 * 3 4
 **/
public class CombineTable {
    public static void main(String[] argc) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String count_str, temp, temp2[];
        int records[];
        while ((count_str = bufr.readLine()) != null) {
            int count_int = Integer.parseInt(count_str);
            records = new int[count_int];
            while (count_int > 0) {
                temp = bufr.readLine();
                temp2 = temp.split(" ");
                records[(Integer.parseInt(temp2[0]))] += Integer.parseInt(temp2[1]);
                count_int--;
            }

            for (int i = 0; i < records.length; i++) {
                if (records[i] != 0) {
                    System.out.println(i + " " + records[i]);
                }
            }
        }
    }
}

