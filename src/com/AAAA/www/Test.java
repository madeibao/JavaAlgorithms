package com.AAAA.www;

/**
 * @program: Pro1->Test
 * @description: 基本测试文件
 * @author: MaYuan
 * @create: 2019-12-24 19:18
 * @version: 1.0
 **/

public class Test {

    static String common(String[] strs) {
        if(strs==null||strs.length==0) {
            return null;
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String temp = strs[0];
        for(int i=1;i<strs.length;i++) {
            temp = helper(temp, strs[i]);
        }
        return temp;

    }

    static String helper(String stra, String strb) {
        int lena = stra.length();
        int lenb = strb.length();

        int len = Math.min(lena, lenb);
        int index =0 ;
        while (index<len) {
            if(stra.charAt(index)!=strb.charAt(index)) {
                break;
            }
            index++;
        }

        return stra.substring(0, index);
    }

    public static void main(String[] args) {
        String[] strs = {"fly", "flmame", "flower"};
        System.out.println(common(strs));
    }

}

