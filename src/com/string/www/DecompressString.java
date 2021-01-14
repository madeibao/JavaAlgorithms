package com.string.www;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @ClassName DecompressString
 * @Author：Mayuan
 * @Date 2020/6/21 21:06
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的解压缩版本。
 **/
class SingleString implements Comparable<SingleString> {
    public String name;
    public int value;

    SingleString(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int compareTo(SingleString singleString) {
        // 比较重复次数

        if (singleString.value > this.value) {
            return -1;

        } else if (singleString.value == this.value && (singleString.name.compareTo(this.name)) > 0) {
            // 重复次数相同，比较字符串ASCII编码顺序
            return -1;
        } else {
            return 1;
        }
    }
}

public class DecompressString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().trim();
        char[] chars = string.trim().toCharArray();// 字符串转字符数组
        ArrayList<StringBuffer> all = new ArrayList<>();// 存字母串
        ArrayList<StringBuffer> allValue = new ArrayList<>();// 存字母串重复次数
        int index = -1;// 存当前解析的字符串位置
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {// 是否是数字
                if (i == 0 || !Character.isDigit(chars[i - 1])) {// 前一位是否是数字
                    allValue.add(new StringBuffer());// 否，新建StringBuffer
                }
                allValue.get(index).append(chars[i]);
            } else {// 是否是字符
                if (i == 0 || !Character.isLetter(chars[i - 1])) {// 前一位是否是字符
                    all.add(new StringBuffer());// 否，新建StringBuffer
                    index++;
                }
                all.get(index).append(chars[i]);
            }
        }
        TreeSet<SingleString> result = new TreeSet<>();// 存SingleString对象，排序
        for (int i = 0; i < allValue.size(); i++) {
            result.add(new SingleString(all.get(i).toString(), Integer.parseInt(allValue.get(i).toString())));
        }
        for (SingleString s : result) {// 输出打印
            int value = s.value;
            String out = s.name;
            for (int i = 0; i < value; i++)
                System.out.print(out);
        }
        System.out.println();
    }

}