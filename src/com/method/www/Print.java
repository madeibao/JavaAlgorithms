package com.method.www;

import java.io.PrintStream;

/**
 * @program: Pro1->Print
 * @description: 所有的通用打印方法
 * @author: MaYuan
 * @create: 2019-12-23 19:31
 * @version: 1.0
 *
 * 其他位置的条用通过引入以下头文件。
 *
 * import static com.method.www.Print.*;
 *
 **/
public class Print {
    /**
     * // Print with a newline:
     *
     * @param obj
     */

    public static void print(Object obj) {
        System.out.println(obj);
    }

    /**
     * // Print a newline by itself:
     */

    public static void print() {
        System.out.println();
    }

    /**
     * // Print with no line break:
     *
     * @param obj
     */

    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    /**
     * The new Java SE5 printf() (from C):
     */
    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
} ///:~
