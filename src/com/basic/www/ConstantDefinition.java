package com.basic.www;

/**
 * @program: JavaWorkSpace2->ConstantDefinition
 * @description: 常量的基本的定义
 * @author: MaYuan
 * @create: 2019-12-25 21:53
 * @version: 1.0
 * Java中的常量的基本的定义方式。
 **/
public class ConstantDefinition {
    static class ConstantClassField {
        public static final String SUNDAY = "SUNDAY";
        public static final String MONDAY = "MONDAY";
        public static final String TUESDAY = "TUESDAY";
        public static final String WEDNESDAY = "WEDNESDAY";
        public static final String THURSDAY = "THURSDAY";
        public static final String FRIDAY = "FRIDAY";
        public static final String SATURDAY = "SATURDAY";
    }

    static class ConstantClassFunction {
        private static final String SUNDAY = "SUNDAY";
        private static final String MONDAY = "MONDAY";
        private static final String TUESDAY = "TUESDAY";
        private static final String WEDNESDAY = "WEDNESDAY";
        private static final String THURSDAY = "THURSDAY";
        private static final String FRIDAY = "FRIDAY";
        private static final String SATURDAY = "SATURDAY";

        public static String getSunday() {
            return SUNDAY;
        }

        public static String getMonday() {
            return MONDAY;
        }

        public static String getTuesday() {
            return TUESDAY;
        }

        public static String getWednesday() {
            return WEDNESDAY;
        }

        public static String getThursday() {
            return THURSDAY;
        }

        public static String getFriday() {
            return FRIDAY;
        }

        public static String getSaturday() {
            return SATURDAY;
        }
    }
}
