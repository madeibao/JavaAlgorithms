package com.algorithm.www;

/**
 * @ClassName ExcelTableChange
 * @Author：Mayuan
 * @Date 2020/4/12 15:48
 * @Description TODO
 * @Version 1.0
 * <p>
 * 表格的转变
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 * <p>
 * 例如，
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/excel-sheet-column-title
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class ExcelTableChange {
    public static String convertToTitle2(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char) (n % 26 + 'A'));
            n = n / 26;
        }
        return sb.reverse().toString();
    }

    public static String convertToTitle(int n) {

        if (n <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char) ('A' + n % 26));
            n = n / 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 701;
        System.out.print(convertToTitle(num));
    }
}



