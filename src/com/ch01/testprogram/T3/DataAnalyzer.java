package com.ch01.testprogram.T3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DataAnalyzer {

    // 这个方法分析数据，计算大于阈值的元素的平均值。
    // This method analyzes the data and calculates the average of elements greater than the threshold.
    public double analyzeData(int[] data, int threshold) {
        double sum = 0;
        int count = 0;

        // 遍历数据数组，检查每个元素是否大于阈值。
        // Iterate through the data array and check if each element is greater than the threshold.
        for (int value : data) {
            if (value > threshold) {
                sum += value;  // 如果大于阈值，将该值加到sum中。
                // If greater than the threshold, add the value to the sum.
                count++;  // 增加计数器。
                // Increment the counter.
            }
        }

        // 如果有大于阈值的元素，返回它们的平均值，否则返回0。
        // If there are elements greater than the threshold, return their average; otherwise, return 0.
        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }

    // 这个方法找到数组中的最大值。
    // This method finds the maximum value in the array.
    public int findMaxValue(int[] data) {
        int maxValue = Integer.MIN_VALUE;  // 初始化最大值为Integer的最小值。
        // Initialize maxValue to Integer's minimum value.

        // 遍历数据数组，寻找最大值。
        // Iterate through the data array to find the maximum value.
        for (int value : data) {
            if (value > maxValue) {
                maxValue = value;  // 更新最大值。
                // Update maxValue.
            }
        }

        return maxValue;  // 返回最大值。
        // Return the maximum value.
    }

    // 这个方法找到数组中的最小值。
    // This method finds the minimum value in the array.
    public int findMinValue(int[] data) {
        int minValue = Integer.MAX_VALUE;  // 初始化最小值为Integer的最大值。
        // Initialize minValue to Integer's maximum value.

        // 遍历数据数组，寻找最小值。
        // Iterate through the data array to find the minimum value.
        for (int value : data) {
            if (value < minValue) {
                minValue = value;  // 更新最小值。
                // Update minValue.
            }
        }

        return minValue;  // 返回最小值。
        // Return the minimum value.
    }

    // 这个方法计算数组的中位数。
    // This method calculates the median of the array.
    public double calculateMedian(int[] data) {
        Arrays.sort(data);  // 对数据数组进行排序。
        // Sort the data array.
        int middle = data.length / 2;
        // 如果数据元素数量为偶数，返回中间两个元素的平均值；如果是奇数，返回中间元素。
        // If the number of data elements is even, return the average of the two middle elements; if odd, return the middle element.
        if (data.length % 2 == 0) {
            return (data[middle - 1] + data[middle]) / 2.0;
        } else {
            return data[middle];
        }
    }

    // 这个方法计算数组中每个值的频率。
    // This method calculates the frequency of each value in the array.
    public Map<String, Integer> calculateFrequency(int[] data) {
        Map<String, Integer> frequencyMap = new HashMap<>();  // 创建一个HashMap来存储频率。
        // Create a HashMap to store the frequencies.

        // 遍历数据数组，计算每个值的频率。
        // Iterate through the data array to calculate the frequency of each value.
        for (int value : data) {
            String key = String.valueOf(value);  // 将每个值转换为字符串键。
            // Convert each value to a string key.
            frequencyMap.put(key, frequencyMap.getOrDefault(key, 0) + 1);  // 更新频率映射。
            // Update the frequency map.
        }

        return frequencyMap;  // 返回频率映射。
        // Return the frequency map.
    }
}