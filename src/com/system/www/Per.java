package com.system.www;

/**
 * @ClassName Per
 * @Author：Mayuan
 * @Date 2024/11/17/星期日 17:16
 * @Description TODO
 * @Version 1.0
 **/
public class Per {
    private Integer id;
    private String startStation;
    private String endStation;
    private Integer startTime;
    private Integer endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Per{" +
                "id=" + id +
                ", startStation='" + startStation + '\'' +
                ", endStation='" + endStation + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

}
