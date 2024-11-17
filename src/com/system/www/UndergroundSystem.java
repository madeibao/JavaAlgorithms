package com.system.www;

import java.util.*;

/**
 * leetcode 设计地铁管理系统
 * 设计地铁进出站管理系统
 *
 * @ClassName UndergroundSystem
 * @Author：Mayuan
 * @Date 2024/11/17/星期日 14:51
 * @Description TODO
 * @Version 1.0
 **/
public class UndergroundSystem {
    private Map<Integer, Per> idMap;
    private List<Per> perList;

    // 初始化相关内容
    public UndergroundSystem() {
        idMap = new HashMap<Integer, Per>();
        perList = new ArrayList<Per>();
    }

    public void checkIn(int id, String stationName, int t) {
        // 乘客进入车站
        Per per = new Per();
        per.setId(id);
        per.setStartStation(stationName);
        per.setStartTime(t);

        idMap.put(id, per);
    }

    public void checkOut(int id, String stationName, int t) {
        // 获取乘客信息
        Per per = idMap.get(id);

        per.setEndStation(stationName);
        per.setEndTime(t);

        // 乘客离开车站之后，移除相关信息
        perList.add(per);
        idMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
//        OptionalDouble k = perList.stream()
//                .filter(e -> startStation.equals(e.getStartStation()) && endStation.equals(e.getEndStation()))
//                .mapToDouble(o -> o.getEndTime() - o.getStartTime()).average();
//        return k.getAsDouble();

        double timeCost = 0.0d;
        int count = 0;
        for (Per per : perList) {
            if (per.getStartStation().equals(startStation) && per.getEndStation().equals(endStation)) {
                timeCost += per.getEndTime() - per.getStartTime();
                count++;
            }
        }
        return timeCost / count;
    }
}
