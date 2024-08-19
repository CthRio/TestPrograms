package com.ch01.testprogram.T0;

public class Triangle {
    public String triangle(int edge1, int edge2, int edge3) {
        if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0) {
            return "Not Triangle"; // 所有边长必须为正数
        }

        // 检查是否满足三角形不等式
        if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
            if (edge1 == edge2 && edge2 == edge3) {
                return "equilateral"; // 等边三角形
            } else if (edge1 == edge2 || edge2 == edge3 || edge1 == edge3) {
                return "isosceles"; // 等腰三角形
            } else {
                return "scalene"; // 普通三角形
            }
        } else {
            return "Not Triangle"; // 不满足三角形不等式
        }
    }
}