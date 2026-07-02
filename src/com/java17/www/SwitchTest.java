package com.java17.www;

/**
 * @ClassName SwitchTest
 * @Author：Mayuan
 * @Date 2024/6/2/星期日 11:43
 * @Description TODO
 * @Version 1.0
 **/
public class SwitchTest {
    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

    public static void main(String[] args) {
        System.out.println(formatterPatternSwitch(10));
    }
}
