package com.ch01.testprogram.T1;

import java.util.Scanner;
import java.util.ArrayList;

public class Cal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 用户输入
        System.out.print("请输入第一个日期的年份: ");
        int year1 = scanner.nextInt();
        System.out.print("请输入第一个日期的月份: ");
        int month1 = scanner.nextInt();
        System.out.print("请输入第一个日期的日期: ");
        int day1 = scanner.nextInt();

        System.out.print("请输入第二个日期的年份: ");
        int year2 = scanner.nextInt();
        System.out.print("请输入第二个日期的月份: ");
        int month2 = scanner.nextInt();
        System.out.print("请输入第二个日期的日期: ");
        int day2 = scanner.nextInt();

        // 计算两个日期之间的天数
        int result = daysBetweenDates(month1, day1, year1, month2, day2, year2);

        // 输出结果
        if (result != -1) {
            System.out.println("从 " + formatDate(year1, month1, day1) + " 到 " + formatDate(year2, month2, day2) + " 之间的天数是: " + result + " 天。");
            // 输出日期范围内的所有日期
            System.out.println("日期范围内的所有日期:");
            ArrayList<String> dates = getAllDatesInRange(year1, month1, day1, year2, month2, day2);
            for (String date : dates) {
                System.out.println(date);
            }
        } else {
            System.out.println("输入的日期不合法或开始日期在结束日期之后。");
        }
    }

    // 扩展后的方法，支持跨年日期的计算
    public static int daysBetweenDates(int month1, int day1, int year1, int month2, int day2, int year2) {
        // 用于存储每个月的天数
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        // 将日期转换为整数数组表示
        int[] start = {year1, month1, day1};
        int[] end = {year2, month2, day2};

        // 检查日期是否合法
        if (!isValidDate(start) || !isValidDate(end)) {
            return -1;
        }

        // 检查开始日期是否在结束日期之后
        if ((start[0] > end[0]) || (start[0] == end[0] && start[1] > end[1]) || (start[0] == end[0] && start[1] == end[1] && start[2] > end[2])) {
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

    // 检查日期是否合法
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

    // 判断是否为闰年
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 计算闰年的数量
    private static int countLeapYears(int year, int month) {
        if (month <= 2) {
            year--;
        }
        return year / 4 - year / 100 + year / 400;
    }

    // 获取日期范围内的所有日期
    public static ArrayList<String> getAllDatesInRange(int year1, int month1, int day1, int year2, int month2, int day2) {
        ArrayList<String> dates = new ArrayList<>();
        int[] startDate = {year1, month1, day1};
        int[] endDate = {year2, month2, day2};

        while (!isAfter(startDate, endDate)) {
            dates.add(formatDate(startDate[0], startDate[1], startDate[2]));
            incrementDate(startDate);
        }
        //dates.add(formatDate(endDate[0], endDate[1], endDate[2])); // Include the end date
        return dates;
    }

    // 检查startDate是否在endDate之后
    private static boolean isAfter(int[] startDate, int[] endDate) {
        if (startDate[0] > endDate[0]) return true;
        if (startDate[0] == endDate[0] && startDate[1] > endDate[1]) return true;
        return startDate[0] == endDate[0] && startDate[1] == endDate[1] && startDate[2] > endDate[2];
    }

    // 日期递增
    private static void incrementDate(int[] date) {
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int year = date[0];
        int month = date[1];
        int day = date[2];

        day++;
        if (month == 2 && isLeapYear(year)) {
            if (day > 29) {
                day = 1;
                month++;
            }
        } else {
            if (day > daysInMonth[month - 1]) {
                day = 1;
                month++;
            }
        }

        if (month > 12) {
            month = 1;
            year++;
        }

        date[0] = year;
        date[1] = month;
        date[2] = day;
    }

    // 格式化日期
    private static String formatDate(int year, int month, int day) {
        return year + "/" + month + "/" + day;
    }
}