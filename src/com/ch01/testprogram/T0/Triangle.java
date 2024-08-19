package com.ch01.testprogram.T0;

public class Triangle {
    // 定义一个较小的容差值，用于浮点数比较
    private static final double EPSILON = 1e-9;

    @SuppressWarnings("DuplicateExpressions")
    public String triangle(double edge1, double edge2, double edge3) {
        // 排序三条边，确保 edge1 <= edge2 <= edge3
        if (edge1 > edge2) {
            double temp = edge1;
            edge1 = edge2;
            edge2 = temp;
        }
        if (edge2 > edge3) {
            double temp = edge2;
            edge2 = edge3;
            edge3 = temp;
        }
        if (edge1 > edge2) {
            double temp = edge1;
            edge1 = edge2;
            edge2 = temp;
        }

        // 检查是否满足三角形不等式
        if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
            // 判断等边三角形
            if (Math.abs(edge1 - edge2) < EPSILON && Math.abs(edge2 - edge3) < EPSILON) {
                return "Equilateral Triangle"; // 等边三角形
            }
            // 判断等腰三角形
            else if (Math.abs(edge1 - edge2) < EPSILON || Math.abs(edge2 - edge3) < EPSILON || Math.abs(edge1 - edge3) < EPSILON) {
                // 判断是否为直角三角形
                if (Math.abs(edge1 * edge1 + edge2 * edge2 - edge3 * edge3) < EPSILON) {
                    return "Isosceles Right Triangle"; // 等腰直角三角形
                }
                // 判断是否为钝角三角形
                else if (edge1 * edge1 + edge2 * edge2 < edge3 * edge3) {
                    return "Isosceles Obtuse Triangle"; // 等腰钝角三角形
                }
                // 否则是锐角三角形
                else {
                    return "Isosceles Acute Triangle"; // 等腰锐角三角形
                }
            }
            // 判断普通三角形
            else {
                // 判断是否为直角三角形
                if (Math.abs(edge1 * edge1 + edge2 * edge2 - edge3 * edge3) < EPSILON) {
                    return "Right Triangle"; // 直角三角形
                }
                // 判断是否为钝角三角形
                else if (edge1 * edge1 + edge2 * edge2 < edge3 * edge3) {
                    return "Obtuse Triangle"; // 钝角三角形
                }
                // 否则是锐角三角形
                else {
                    return "Acute Triangle"; // 锐角三角形
                }
            }
        } else {
            return "Not Triangle"; // 不满足三角形不等式
        }
    }
}