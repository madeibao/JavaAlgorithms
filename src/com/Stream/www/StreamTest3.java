package com.Stream.www;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * @ClassName StreamTest3
 * @Author：Mayuan
 * @Date 2025/3/8/星期六 16:46
 * @Description TODO
 * @Version 1.0
 **/
public class StreamTest3 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>() {{
            add(new User("Tony", 20, "12"));
            add(new User("Pepper", 20, "123"));
            add(new User("Tony", 22, "1234"));
            add(new User("Tony", 22, "12345"));
        }};

        //只通过名字去重
        List<User> streamByNameList = list.stream().collect(Collectors.collectingAndThen(
                Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User::getName))), ArrayList::new
        ));

        List<User> uniqueByNameList = list.stream()
                .collect(Collectors.toMap(
                        User::getName, // 键为名字
                        user -> user, // 值为 User 对象
                        BinaryOperator.minBy(Comparator.comparingInt(User::getId)) // 如果有重复名字，保留年龄较小的那个
                ))
                .values()
                .stream()
                .toList();

        //通过名字和年龄去重
        List<User> streamByNameAndAgeList = list.stream().collect(Collectors.collectingAndThen(
                Collectors.toCollection(
                        () -> new TreeSet<>(Comparator.comparing(o -> o.getName() + o.getPhone()))), ArrayList::new
        ));
        for(User user : uniqueByNameList) {
            System.out.println(user.getId()+ " "+ user.getName()+ " "+ user.getPhone());
        }

        System.out.println("                       ");
        for(User user : streamByNameAndAgeList) {
            System.out.println(user.getId()+ " "+ user.getName()+ " "+ user.getPhone());
        }
    }
}
