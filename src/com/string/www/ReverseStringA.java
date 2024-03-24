package com.string.www;

/**
 * @ClassName ReverseStringA
 * @Author：Mayuan
 * @Date 2023/10/17/0017 11:07
 * @Description TODO
 * @Version 1.0
 **/
public class ReverseStringA {

    public String reverseWords(String s) {
        //去掉两端空格
        s = s.trim();
        String[] string = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=string.length-1;i>=0;i--){
            if(string[i].equals(" ")||string[i].equals("")){
                continue;
            }
            res.append(string[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {

        String str = "I am a Student";
        System.out.println(new ReverseStringA().reverseWords(str));
    }
}

