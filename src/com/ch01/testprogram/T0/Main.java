package com.ch01.testprogram.T0;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        // 测试等边三角形
        System.out.println(triangle.triangle(3, 3, 3)); // 输出: Equilateral Triangle

        // 测试等腰直角三角形
        System.out.println(triangle.triangle(1, 1, Math.sqrt(2))); // 输出: Isosceles Right Triangle

        // 测试等腰钝角三角形
        System.out.println(triangle.triangle(5, 5, 8)); // 输出: Isosceles Obtuse Triangle

        // 测试等腰锐角三角形
        System.out.println(triangle.triangle(5, 5, 6)); // 输出: Isosceles Acute Triangle

        // 测试普通直角三角形
        System.out.println(triangle.triangle(3, 4, 5)); // 输出: Right Triangle

        // 测试普通钝角三角形
        System.out.println(triangle.triangle(2, 3, 4)); // 输出: Obtuse Triangle

        // 测试普通锐角三角形
        System.out.println(triangle.triangle(4, 5, 6)); // 输出: Acute Triangle

        // 测试不是三角形的情况
        System.out.println(triangle.triangle(1, 2, 3)); // 输出: Not Triangle

        // 测试边长为零的情况
        System.out.println(triangle.triangle(0, 1, 1)); // 输出: Not Triangle

        // 测试负边长的情况
        System.out.println(triangle.triangle(-1, 2, 2)); // 输出: Not Triangle
    }
}