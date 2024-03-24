package com.queue.www;

/**
 * @ClassName Priority
 * @Author：Mayuan
 * @Date 2023/10/22/0022 17:26
 * @Description TODO
 * @Version 1.0
 **/

/*
peek()//返回队首元素
poll()//返回队首元素，队首元素出队列
add()//添加元素
size()//返回队列元素个数
isEmpty()//判断队列是否为空，为空返回true,不空返回false
        */
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority {
    int age;
    String name;
    Priority(int age, String name){
        this.age = age;
        this.name = name;
    }
    static Comparator<Integer> cmp = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1; //大的在前
        }
    };
    static Comparator<Priority> cmpp = new Comparator<Priority>() {
        @Override
        public int compare(Priority o1, Priority o2) {
            if(o1.age != o2.age) return o1.age - o2.age;
            return o1.name.compareTo(o2.name); //字典序从小到大
        }
    };
    public static void main(String[] args) {
        // 不使用比较器 按照升序排列 从小到大输出
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(5);
        pq.add(2);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        // 使用比较器
        Queue<Integer> q = new PriorityQueue<>(cmp);
        q.add(3);
        q.add(5);
        q.add(2);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        // 自定义排序
        Queue<Priority> qq = new PriorityQueue<Priority>(cmpp);
        qq.add(new Priority(18,"a"));
        qq.add(new Priority(19,"b"));
        qq.add(new Priority(12,"c"));
        qq.add(new Priority(12,"d"));
        Priority priority;
        while(!qq.isEmpty()){
            priority = qq.poll();
            System.out.println(priority.age+" "+priority.name);
        }
    }


}
