package com.basic.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Interface2
 * @Author：Mayuan
 * @Date 2021/4/7/0007 22:12
 * @Description TODO
 * @Version 1.0
 *
 * JAVA 将接口的引用指向实现类的对象
也就是说所有实现了接口List的类,都可以用List接口来声明对象类型,然后用实体类进行实例化.
这表明了接口可以用来作为类型的表述.当然,生成的对象list只能调用接口List中提供的方法.

 **/
public class Interface2 {

    public static void main(String[] args) {
        List list=new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);


        list.forEach(System.out::println);


    }
}
