package com.string2.www;

/**
 * @ClassName VersionCompare
 * @Author：Mayuan
 * @Date 2023/9/18/0018 22:34
 * @Description TODO
 * @Version 1.0
 **/
public class VersionCompare {

    public static int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");

        for (int i = 0; i < str1.length || i < str2.length; i++) {
            int x = 0;
            int y = 0;
            if (i < str1.length) {
                x = Integer.parseInt(str1[i]);
            }

            if (i < str2.length) {
                y = Integer.parseInt(str2[i]);
            }

            if (x > y) {
                return 1;
            }

            if (x < y) {
                return -1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        String version1 = "1.01", version2 = "1.001";
        System.out.println(compareVersion(version1, version2));
    }
}
