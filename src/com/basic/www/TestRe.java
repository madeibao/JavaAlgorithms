package com.basic.www;

/**
 * @ClassName TestRe
 * @Author：Mayuan
 * @Date 2021/4/30/0030 11:06
 * @Description TODO
 * @Version 1.0
 *
 *
 * Java反射的三种获取方法。
 **/
public class TestRe {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<TestRe> class1 = TestRe.class;
        System.out.println("类名1："+class1.getName());

        TestRe test2 = new TestRe();
        Class<? extends TestRe> class2 = test2.getClass();
        System.out.println("类名2："+class2.getName());

        Class<?> class3 = Class.forName("com.basic.www.TestRe");
        System.out.println("类名3："+class3.getName());
        if(class1==class2){
            System.out.println("class1==class2");
        }
        if(class1==class3){
            System.out.println("class1==class3");
        }
    }
}
