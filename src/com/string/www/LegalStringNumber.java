package com.string.www;

/**
 * @ClassName LegalStringNumber
 * @Author：Mayuan
 * @Date 2020/4/5 11:10
 * @Description TODO
 * @Version 1.0
 * <p>
 * 合法的字符串的数字
 **/
public class LegalStringNumber {

    public static boolean isNumeric(char[] str) {
        boolean r = true;
        String s = String.valueOf(str);
        if (s.contains(".")) {
            String t[] = s.split("\\.");
            if (t.length == 2) {

            } else {
                r = false;
            }
        }
        if (s.contains("e")) {
            String t[] = s.split("e");
            if (t.length == 2) {
                if (t[1].contains(".")) {
                    r = false;
                }
            } else {
                r = false;
            }
        }
        if (s.contains("E")) {
            String t[] = s.split("E");
            if (t.length == 2) {
                if (t[1].contains(".")) {
                    r = false;
                }
            } else {
                r = false;
            }
        }


        int n = str.length;
        if (r && n > 0) {
            if (str[0] == '+' || str[0] == '-' || (str[0] >= '1' && str[0] <= '9')) {
                for (int i = 1; i < n; i++) {
                    char t = str[i];
                    if ((t >= '0' && t <= '9') || t == 'e' || t == 'E' || t == '.') {

                    } else if (t == '+' || t == '-') {
                        if (str[i - 1] == 'e' || str[i - 1] == 'E') {

                        } else {
                            r = false;
                            break;
                        }
                    } else {
                        r = false;
                        break;
                    }
                }
            } else {
                r = false;
            }

        }

        return r;
    }

    public static void main(String[] args) {

        String s = "e9";
        char[] ch = s.toCharArray();
        System.out.println(isNumeric(ch));
    }
}
