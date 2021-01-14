package com.datastructure.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Pro1->ArrayList2ArrayTest
 * @description: 链表数组相互转化
 * @author: MaYuan
 * @create: 2019-12-23 18:57
 * @version: 1.0
 * <p>
 * 链表和数组内容的相互的转化。
 **/
public class ArrayList2ArrayTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("王利虎");
        list.add("张三");
        list.add("李四");
        int size = list.size();
        String[] array = new String[size];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        /*第二种方法：
         *  String[] array = (String[])list.toArray(new String[size]);
	        for(int i=0;i<array.length;i++){
	            System.out.println(array[i]);
	        }
         */
    }
}
