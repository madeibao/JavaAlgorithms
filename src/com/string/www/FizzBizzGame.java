package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FIzzBizzGame
 * @Author：Mayuan
 * @Date 2020/2/18 17:18
 * @Description TODO
 * @Version 1.0
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * <p>
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * <p>
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * <p>
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 * <p>
 * 示例：
 * <p>
 * n = 15,
 * <p>
 * 返回:
 * [
 * "1",
 * "2",
 * "Fizz",
 * "4",
 * "Buzz",
 * "Fizz",
 * "7",
 * "8",
 * "Fizz",
 * "Buzz",
 * "11",
 * "Fizz",
 * "13",
 * "14",
 * "FizzBuzz"
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fizz-buzz
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class FizzBizzGame {
    public static List<String> fizzBuzz(int n) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append(fizz);
            }
            if (i % 5 == 0) {
                sb.append(buzz);
            }

            if (sb.length() == 0) {
                sb.append(i);
            }
            result.add(sb.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> res = fizzBuzz(15);
        for (String str : res) {
            System.out.println(str);
        }
    }
}
