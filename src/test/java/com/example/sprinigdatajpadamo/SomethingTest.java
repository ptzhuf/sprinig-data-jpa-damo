package com.example.sprinigdatajpadamo;

import java.util.Date;

public class SomethingTest {
    int calculateDaysBetweenDates(Date startDate, Date endDate) {
        long diff = endDate.getTime() - startDate.getTime();
        return (int) (diff / (24 * 60 * 60 * 1000));
    }
    // 计算两个日期之间的天数
    public static void main(String[] args) {
        Date startDate = new Date();
        Date endDate = new Date();
        int daysBetween = new SomethingTest().calculateDaysBetweenDates(startDate, endDate);
        System.out.println(daysBetween);
    }
    /**
     * 获取行政区划代码
     */

}
