package com.Stream.www;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * java 流中
 * @ClassName CollectorsTestDemo
 * @Author：Mayuan
 * @Date 2025/3/8/星期六 17:33
 * @Description TODO
 * @Version 1.0
 **/
public class CollectorsTestDemo {
    public static void main(String[] args) {
        System.out.println("---------1------------------");
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,6);
        List<Integer> list2 = integers.stream().map(x -> x*x).toList();
        list2.forEach(System.out::println);// output: [1,4,9,16,25,36,36]

        System.out.println("-----------2----------------");
        List<Integer> integersSe = Arrays.asList(1,2,3,4,5,6,6);
        // 下面的两个写法是一样的
        Integer sum = integers
                .stream()
                .collect(Collectors.summingInt(x -> x));

        Integer sum2 = integers.stream().mapToInt(i->i).sum();
        System.out.println(sum2);

        System.out.println("------------3---------------");
        List<Integer> integersTh = Arrays.asList(1,2,3,4,5,6,6);
        List<String> stringsTh = Arrays.asList("alpha","beta","gamma");
        Integer num = integersTh.stream()
                .collect(Collectors.minBy(Comparator.naturalOrder()))
                .get();

        Integer numSe = integersTh.stream()
                .min(Comparator.naturalOrder())
                .get();

        // output: 1
        System.out.println(num+" "+numSe);
        String minStr = stringsTh.stream()
                .collect(Collectors.minBy(Comparator.naturalOrder()))
                .get();

        String minStrSe = stringsTh.stream()
                .min(Comparator.naturalOrder())
                .get();
        // output: alpha
        System.out.println(minStr+" "+ minStrSe);


        List<Integer> integersFourth = Arrays.asList(1,2,3,4,5,6,6);
        IntSummaryStatistics stats = integers
                .stream()
                .collect(Collectors.summarizingInt(x -> x ));

        System.out.println(stats);
    }
}
