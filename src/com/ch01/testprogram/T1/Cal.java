package com.ch01.testprogram.T1;

/**
 * Cal类用于计算两个给定日期之间的天数。
 */
public class Cal {

    /**
     * 计算两个日期之间的天数。
     *
     * @param month1 第一个日期的月份
     * @param day1   第一个日期的日期
     * @param month2 第二个日期的月份
     * @param day2   第二个日期的日期
     * @param year   两个日期的年份（假设年份相同）
     * @return 两个日期之间的天数，如果日期不合法或者第一个日期在第二个日期之后，则返回-1
     */
    public static int daysBetweenDates(int month1, int day1, int month2, int day2, int year) {
        // 用于存储每个月的天数
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        // 将日期转换为整数数组表示
        int[] start = {year, month1, day1};
        int[] end = {year, month2, day2};

        // 检查日期是否合法
        if (!isValidDate(start) || !isValidDate(end)) {
            return -1;
        }

        // 检查开始日期是否在结束日期之后
        if ((start[1] > end[1]) || (start[1] == end[1] && start[2] > end[2])) {
            return -1;
        }

        // 计算开始日期距离年初的天数
        int startDays = start[0] * 365 + start[2];
        for (int i = 0; i < start[1] - 1; i++) {
            startDays += daysInMonth[i];
        }
        startDays += countLeapYears(start[0], start[1]);

        // 计算结束日期距离年初的天数
        int endDays = end[0] * 365 + end[2];
        for (int i = 0; i < end[1] - 1; i++) {
            endDays += daysInMonth[i];
        }
        endDays += countLeapYears(end[0], end[1]);

        // 返回两个日期之间的天数
        return Math.abs(endDays - startDays);
    }

    /**
     * 检查日期是否合法。
     *
     * @param date 要检查的日期
     * @return 如果日期合法，则返回true，否则返回false
     */
    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    private static boolean isValidDate(int[] date) {
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int year = date[0];
        int month = date[1];
        int day = date[2];

        // 检查月份和日期的范围是否合法
        if (month < 1 || month > 12 || day < 1) {
            return false;
        }

        // 如果是闰年，二月份的天数为29
        if (month == 2 && isLeapYear(year)) {
            return day <= 29;
        }

        // 检查日期是否超出了每个月的天数
        return day <= daysInMonth[month - 1];
    }

    /**
     * 判断是否为闰年。
     *
     * @param year 要检查的年份
     * @return 如果是闰年，则返回true，否则返回false
     */
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * 计算闰年的数量。
     *
     * @param year  要计算的年份
     * @param month 当前月份
     * @return 在当前月份之前的闰年的数量
     */
    private static int countLeapYears(int year, int month) {
        if (month <= 2) {
            year--;
        }
        // 以400年为一个周期，每100年中有24个闰年，每400年中有97个闰年
        return year / 4 - year / 100 + year / 400;
    }
}