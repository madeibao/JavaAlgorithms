package com.basic.www;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName JavaDateA
 * @Author：Mayuan
 * @Date 2022/7/14/0014 22:19
 * @Description TODO
 * @Version 1.0
 *
 * 判断两个日期同一天
 **/
public class JavaDateA {
    public static boolean isTheSameDay(Date d1,Date d2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        try {
            return (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR))
                    && (c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH))
                    && (c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void main(String[] args) throws Exception {

        String dateStr = "2022-07-14";
        String dateStr2 = "2022-07-14";
        //获得SimpleDateFormat类，我们转换为yyyy-MM-dd的时间格式
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        Date datea  = format.parse(dateStr);
        Date dateb  = format2.parse(dateStr2);
        System.out.println(isTheSameDay(datea,dateb));
    }
}
