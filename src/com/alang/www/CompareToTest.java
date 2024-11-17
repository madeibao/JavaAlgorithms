package com.alang.www;

import java.util.Arrays;

/**
 * @ClassName CompareToTest
 * @Author：Mayuan
 * @Date 2020/10/18 15:24
 * @Description TODO
 * @Version 1.0
 * <p>
 * lang 包下面的compareTo 方法
 **/
public class CompareToTest {

    public static void main(String[] args) {
        Object[] objArray = {new Person(20, "jack"),
                             new Person(17, "tom"),
                             new Person(27, "aj")};

        Arrays.sort(objArray);
        for (Object ob : objArray) {
            System.out.println(ob);
        }
    }
}
