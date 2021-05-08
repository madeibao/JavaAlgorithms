package com.AAAA.www;

/**
 * @ClassName Single
 * @Author：Mayuan
 * @Date 2021/5/7/0007 22:24
 * @Description TODO
 * @Version 1.0
 **/
public class Single {
    private volatile static  Single single;

    private Single() {}

    public static Single getInstance() {
        if(single==null) {
            synchronized (Single.class) {
                if(single==null) {
                    single = new Single();
                }
            }
        }

        return single;
    }
}
