package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IPTest3
 * @Author：Mayuan
 * @Date 2020/10/8 11:12
 * @Description TODO
 * @Version 1.0
 * <p>
 * 复原IP地址的值。
 **/
public class IpTest3 {
    public static List<String> restoreIpAddresses(String s) {
        List<String> ret = new ArrayList<>();

        StringBuilder ip = new StringBuilder();
        for (int a = 1; a < 4; ++a) {
            for (int b = 1; b < 4; ++b) {
                for (int c = 1; c < 4; ++c) {
                    for (int d = 1; d < 4; ++d) {
                        if (a + b + c + d == s.length()) {

                            int n1 = Integer.parseInt(s.substring(0, a));
                            int n2 = Integer.parseInt(s.substring(a, a + b));
                            int n3 = Integer.parseInt(s.substring(a + b, a + b + c));
                            int n4 = Integer.parseInt(s.substring(a + b + c));
                            if (n1 <= 255 && n2 <= 255 && n3 <= 255 && n4 <= 255) {
                                ip.append(n1).append('.').append(n2).append('.').append(n3).append('.').append(n4);

                                // 因为加了3个原点。
                                if (ip.length() == s.length() + 3) {
                                    ret.add(ip.toString());
                                }

                                // 把内容来进行清空处理。
                                ip.delete(0, ip.length());
                            }
                        }
                    }
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> res = restoreIpAddresses(s);
        res.forEach(System.out::println);
    }
}
