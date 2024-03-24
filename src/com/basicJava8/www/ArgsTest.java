package com.basicJava8.www;

/**
 * @ClassName ArgsTest
 * @Author：Mayuan
 * @Date 2020/3/14 16:24
 * @Description TODO
 * @Version 1.0
 **/
class Aa {

}

public class ArgsTest {

    public static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Can take individual elements:
        printArray(47, (float) 3.14, 11.11);
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new Aa(), new Aa(), new Aa());
        // Or an array:
        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        printArray(); // Empty list is OK
    }
}
