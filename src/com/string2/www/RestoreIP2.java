package com.string2.www;

import java.util.ArrayList;
import java.util.List;

/**
 * 用深度递归的方法来求解
 *
 * @ClassName RestoreIP2
 * @Author Mayuan
 * @Date 2026/11/7/星期六 10:27
 * @Version 1.0
 **/
public class RestoreIP2 {
    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        dfs(s, new ArrayList<>());
        return res;
    }

    public void dfs(String s, List<String> temp) {
        if (temp.size() == 4) {
            if (s.isEmpty()) {
                res.add(String.join(".", temp));
            }
            return;
        }
        for (int i = 1; i < 4 && i <= s.length(); i++) {
            String str = s.substring(0, i);
            if (validIP(str)) {
                temp.add(str);
                dfs(s.substring(i), temp);
                temp.removeLast();
            }
        }
    }

    public boolean validIP(String str) {
        if (str.isEmpty()) {
            return false;
        }
        if (str.length() > 3) {
            return false;
        }
        if (str.length() > 1 && str.charAt(0) == '0') {
            return false;
        }
        int num = Integer.parseInt(str);
        return num >= 0 && num <= 255;
    }

    public static void main(String[] args) {
        String str = "25525511135";
        RestoreIP2 rs = new RestoreIP2();
        List<String> res = rs.restoreIpAddresses(str);
        res.forEach(System.out::println);
    }
}
