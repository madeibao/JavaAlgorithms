package com.basicJava8.www;

/**
 * @ClassName AssignMent
 * @Author：Mayuan
 * @Date 2020/3/12 15:41
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java运算符的赋值操作
 * <p>
 * java的赋值，指向的是同一个引用，所以， 改变第一个的内容，改变的是第二个的内容。
 **/

class Tank {
    int level;
}

/**
 * @author Mayuan
 */
public class AssignMent {

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;

        System.out.println("t1.level " + t1.level + "    t2.level " + t2.level);
        t1 = t2;
        System.out.println("t1.level " + t1.level + "    t2.level " + t2.level);
        t1.level = 27;
        System.out.println("t1.level " + t1.level + "    t2.level " + t2.level);

        /**
         *
         * 1: t1.level: 9, t2.level: 47
         * 2: t1.level: 47, t2.level: 47
         * 3: t1.level: 27, t2.level: 27
         */
    }
}
