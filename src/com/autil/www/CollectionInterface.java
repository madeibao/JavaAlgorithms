package com.autil.www;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionInterface
 * @Author：Mayuan
 * @Date 2020/10/18 15:54
 * @Description TODO
 * @Version 1.0
 * <p>
 * collection接口的继承案例解析
 * java里面是可以这么写入实例化的操作来进行的。
 * <p>
 * 在java里面，bai是可以这么实例化的:
 * 接口名 name=new 实现了du此接口的类();
 * 对应你的代码zhi:
 * Collection c=new ArrayList(); ArrayList实现List接口，而daoList接口又继承Collection接口，
 * 所以，这么写是可以的，但它实例化的最终还是一个ArrayList的实例。
 * 同理：
 * 父类 name=new 子类();这样写也是可以的。
 **/
public class CollectionInterface {
    public static void test1() {

        //多态引入,为的是生成一个Collection的对象c,而对象c就只能使用collection的方法而不受到ArrayList的干扰

        Collection c = new ArrayList();
        c.add("张三");
        c.add("李四");
        c.add("王五");

        Collection other = new ArrayList();
        other.add("赵柳");
        other.add("赵四");

        // 测试add()方法的参数是Object类型的
        // int[] array1 = {1,2,3};

        // other.add(array1);

        System.out.println(other);

        //这里要对比c.add()方法和c.addAll()方法的不同
        // c.addAll(other);
        // c.add(other);

        System.out.println(c.size());
        Object[] array = c.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        test1();
    }

}
