package com.basicJava8.www;

/**
 * @ClassName BananaPeel
 * @Author：Mayuan
 * @Date 2020/3/13 22:15
 * @Description TODO
 * @Version 1.0
 * <p>
 * java的peel方法的预测。
 **/

class Banana {
    Banana() {
    }

    void peel(int i) {
        System.out.println("current is " + i);
    }
}

/**
 * @author mayuan
 */
public class BananaPeel {

    public static void main(String[] args) {
        Banana a = new Banana(), b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}
