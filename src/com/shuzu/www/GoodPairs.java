package com.shuzu.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GoodPairs
 * @Author：Mayuan
 * @Date 2024/11/17/星期日 22:04
 * @Description 好的数对
 * @Version 1.0
 **/
public class GoodPairs {

    public long countBadPairs(int[] nums) {
        Long len =  Long.valueOf(nums.length) ;
        // 公式计算所有组合数
        Long count = (len*(len-1)/2);
        Map<Integer, Long> map = new HashMap<>();

//        // 数值转换 并用 map 记录当前数值出现频次
//        for(int i=0;i<nums.length;i++){
//            nums[i] = nums[i] - i;
//            Long res = map.getOrDefault(nums[i], 0L);
//            map.put(nums[i], res+1);
//        }

        for(int i=0;i<nums.length;i++) {
            nums[i] = nums[i] - i;
            map.put(nums[i], map.getOrDefault(nums[i], 0L) + 1);
        }

        // 遍历每一个key 计算 value*（value-1）/2 即好数对的组合数
        for(Map.Entry<Integer, Long> entry : map.entrySet()){
            count -= entry.getValue()*(entry.getValue()-1)/2;
        }
        return count;
    }
}
    

