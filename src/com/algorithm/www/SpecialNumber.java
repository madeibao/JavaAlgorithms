package com.algorithm.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: JavaWorkSpace2->SpecialNumber
 * @description: 判断一个数数字是否为中兴对称数字
 * @author: MaYuan
 * @create: 2020-01-01 19:44
 * @version: 1.0
 * <p>
 * 中心对称数是指一个数字在旋转了 180 度之后看起来依旧相同的数字（或者上下颠倒地看）。
 * <p>
 * 请写一个函数来判断该数字是否是中心对称数，其输入将会以一个字符串的形式来表达数字。
 * 示例 1:
 * <p>
 * 输入:  "69"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:  "88"
 * 输出: true
 * <p>
 * 示例 3:
 * <p>
 * 输入:  "962"
 * 输出: false
 **/
public class SpecialNumber {

    public static boolean isStrobogrammatic(String s) {
        // 69, 88, 00, 11, 6969, 698869, 69869, 6908069, 886988
        Map<Character, Character> map = new HashMap<>(5);
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            // 如果不在指定的包含的字符以内，必定是错误的。
            if (!map.containsKey(s.charAt(i))) {
                return false;
            }
            if (map.get(s.charAt(i++)) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isStrobogrammatic("88"));
    }
}
