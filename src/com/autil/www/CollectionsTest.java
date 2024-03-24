package com.autil.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName CollectionsTest
 * @Author：Mayuan
 * @Date 2020/10/18 16:28
 * @Description TODO
 * @Version 1.0
 * <p>
 * java的collections的测试案例内容。
 **/
public class CollectionsTest {
    public static void main(String[] args) {
        List c = new ArrayList();
        c.add("v");
        c.add("l");
        c.add("o");
        c.add("e");
        System.out.println(c);
        Collections.sort(c);
        System.out.println(c);
    }
}
