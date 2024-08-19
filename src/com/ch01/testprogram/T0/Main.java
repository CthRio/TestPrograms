package com.ch01.testprogram.T0;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        // 测试各种情况
        System.out.println(triangle.triangle(3, 3, 3)); // 应该返回 "equilateral"
        System.out.println(triangle.triangle(3, 4, 5)); // 应该返回 "scalene"
        System.out.println(triangle.triangle(5, 5, 8)); // 应该返回 "isosceles"
        System.out.println(triangle.triangle(1, 2, 3)); // 应该返回 "Not Triangle"
        System.out.println(triangle.triangle(0, 2, 3)); // 应该返回 "Not Triangle"
        System.out.println(triangle.triangle(3, -2, 5)); // 应该返回 "Not Triangle"
    }
}