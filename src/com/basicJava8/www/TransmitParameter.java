package com.basicJava8.www;

/**
 * @ClassName TransmitParameter
 * @Author：Mayuan
 * @Date 2020/6/22 15:58
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的传递参数。
 **/


class User2 {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        return "name== " + name + " age===" + age;
    }
}

public class TransmitParameter {
    public static void main(String[] args) {
        String a = "hello";
        int b = 1;

        User2 user = new User2();
        user.setName("main");
        user.setAge(2);

        pass(user, a, b);
        System.out.println("main方法中的user是  " + user.toString());
        System.out.println("Main方法中的a的值是  " + a + "  Main方法中的b的值是  " + b);
    }

    public static void pass(User2 user, String a, int b) {
        a = "你好";
        b = 3;

        user.setName("pass");
        user.setAge(4);

        System.out.println("Pass方法的的user 是：   " + user.toString());
        System.out.println("Pass方法的a的值是:    " + a + "   pass 方法的b的值是" + b);
    }
}
