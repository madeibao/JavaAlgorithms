package com.string.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * @ClassName StringReaderRegex
 * @Author：Mayuan
 * @Date 2020/7/4 16:22
 * @Description TODO
 * @Version 1.0
 * <p>
 * 从文本中读取一个字符串的结果值。
 * 然后返回。
 **/
public class StringReaderRegex {
    public static BufferedReader input = new BufferedReader(
            new StringReader("Sir Robin of Camelot\n22 1.61803"));

    public static void main(String[] args) {
        try {
            System.out.println("What is your name?");
            String name = input.readLine();
            System.out.println(name);
            System.out.println("How old are you? What is your favorite double?");
            System.out.println("(input: <age> <double>)");
            String numbers = input.readLine();
            System.out.println(numbers);

            // 通过一个字符的内容来进行分割，然后返回的是结果值。
            String[] numArray = numbers.split(" ");

            int age = Integer.parseInt(numArray[0]);
            double favorite = Double.parseDouble(numArray[1]);

            System.out.format("Hi %s.\n", name);
            System.out.format("In 5 years you will be %d.\n", age + 5);
            System.out.format("My favorite double is %f.", favorite / 2);

        } catch (IOException e) {
            System.err.println("I/O exception");
        }
    }
}
