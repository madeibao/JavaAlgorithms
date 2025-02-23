package com.Stream.www;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * StreamTest2 流学习代码
 * @ClassName StreamTest2
 * @Author：Mayuan
 * @Date 2025/2/23/星期日 18:41
 * @Description TODO
 * @Version 1.0
 **/
public class StreamTest2 {

    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom(new byte[]{1, 3, 3, 7});
        int[] randoms = IntStream.generate(secureRandom::nextInt)
                .filter(n -> n > 0)
                .limit(10)
                .toArray();
        System.out.println(Arrays.toString(randoms));

        int[] nums = IntStream.iterate(1, n -> n * 2)
                .limit(11)
                .toArray();
        System.out.println(Arrays.toString(nums));

        int[] nums2 = IntStream.iterate(1, n->n+10)
                .limit(10)
                .toArray();

        System.out.println(Arrays.toString(nums2));
    }
}
