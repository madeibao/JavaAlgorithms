package com.datastructure.www.treesettest2;

/**
 * @ClassName Dog
 * @Author：Mayuan
 * @Date 2020/3/9 11:39
 * @Description TODO
 * @Version 1.0
 * <p>
 * 定义一个狗的类，来计算各个set之间的性能
 **/
class Dog implements Comparable<Dog> {
    int size;

    public Dog(int s) {
        size = s;
    }

    public String toString() {
        return size + "";
    }

    @Override
    public int compareTo(Dog o) {
        //数值大小比较
        return size - o.size;
    }
}
