package com.string2.www;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @ClassName ValidIP
 * @Author Mayuan
 * @Date 2026/11/7/星期六 10:16
 * @Version 1.0
 **/
public class RestoreIP {

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= 4; b++) {
                for (int c = 1; c <= 4; c++) {
                    for (int d = 1; d <= 4; d++) {
                        if (a + b + c + d == s.length()) {
                            String x = s.substring(0, a);
                            String y = s.substring(a, a + b);
                            String m = s.substring(a + b, a + b + c);
                            String n = s.substring(a + b + c, a + b + c + d);
                            if (validIP(x) && validIP(y) && validIP(m) && validIP(n)) {
                                res.add(String.join(".", List.of(x, y, m, n)));
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    public boolean validIP(String str) {
        if (str.isEmpty()) {
            return false;
        }
        if (str.length() > 4) {
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
        RestoreIP rs = new RestoreIP();
        List<String> res = rs.restoreIpAddresses(str);
        res.forEach(System.out::println);
    }
}
