package com.basicJava8.www;

/**
 * @ClassName ThisTest
 * @Author：Mayuan
 * @Date 2020/3/13 11:41
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的关键字的this的应用。
 **/
public class ThisTest {
    String name;

    private void setName(String name) {
        this.name = name;
        System.out.println("setName is " + this.name);
    }

    private void thisTest(String name) {
        this.setName(name);
        System.out.println("thisTest: " + this.name);
    }

    public static void main(String[] args) {

        ThisTest tt = new ThisTest();
        tt.setName("Yida");
        tt.thisTest("Jenny");
    }
}
