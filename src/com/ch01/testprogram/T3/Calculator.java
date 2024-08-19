package com.ch01.testprogram.T3;

public class Calculator {

    // 这个方法根据输入参数执行复杂的计算。
    // This method performs a complex calculation based on the input parameters.
    public double complexCalculation(int a, int b, int c, int d, int e) {
        double result;

        // 检查'a'是否大于'b'，且'b'大于'c'。
        // Check if 'a' is greater than 'b' and 'b' is greater than 'c'.
        if (a > b && b > c) {
            result = a * b - c;  // 将'a'和'b'相乘，然后减去'c'。
            // Multiply 'a' and 'b', then subtract 'c'.
        }
        // 检查'c'是否大于'd'或'd'是否小于'e'。
        // Check if 'c' is greater than 'd' or 'd' is less than 'e'.
        else if (c > d || d < e) {
            result = (a + b + c) * 1.0 / (d + e);  // 计算'a'、'b'和'c'的和，然后除以'd'和'e'的和。
            // Calculate the sum of 'a', 'b', and 'c', then divide by the sum of 'd' and 'e'.
        }
        // 检查'a'和'b'的和是否大于'c'且'd'是否大于'e'。
        // Check if the sum of 'a' and 'b' is greater than 'c' and 'd' is greater than 'e'.
        else if (a + b > c && d > e) {
            result = Math.sqrt(a * b) + Math.pow(c, 2);  // 计算'a'乘'b'的平方根，然后加上'c'的平方。
            // Calculate the square root of 'a' times 'b' and add the square of 'c'.
        }
        // 检查'a'是否大于100，'b'是否小于50，且'c'是否大于30。
        // Check if 'a' is greater than 100, 'b' is less than 50, and 'c' is greater than 30.
        else if (a > 100 && b < 50 && c > 30) {
            result = Math.log(a) * Math.sin(b) + Math.cos(c);  // 计算'a'的对数乘以'b'的正弦值，然后加上'c'的余弦值。
            // Calculate the logarithm of 'a' times the sine of 'b' and add the cosine of 'c'.
        }
        // 如果上述条件都不满足，则进行默认计算。
        // Default calculation if none of the above conditions are met.
        else {
            result = (a + c) * (b + d) - e;  // 计算'a'和'c'的和乘以'b'和'd'的和，然后减去'e'。
            // Multiply the sum of 'a' and 'c' by the sum of 'b' and 'd', then subtract 'e'.
        }

        // 如果结果大于100，则调整结果。
        // Adjust the result if it is greater than 100.
        if (result > 100) {
            result *= 0.9;  // 将结果减少10%。
            // Reduce the result by 10%.
        }
        // 如果结果小于50，则调整结果。
        // Adjust the result if it is less than 50.
        else if (result < 50) {
            result += 10;  // 将结果增加10。
            // Increase the result by 10.
        }

        // 如果结果大于200且'a'大于50，则进一步调整结果。
        // Further adjust the result if it is greater than 200 and 'a' is greater than 50.
        if (result > 200 && a > 50) {
            result /= 2;  // 将结果减半。
            // Halve the result.
        }

        return result;
    }

    // 这个方法根据各种输入条件检查资格。
    // This method checks the eligibility based on various input criteria.
    public boolean checkEligibility(int age, int experience, int certifications, double score, int referrals) {
        // 如果年龄小于25岁且经验少于3年，返回false。
        // If the age is less than 25 and experience is less than 3 years, return false.
        if (age < 25 && experience < 3) {
            return false;
        }

        // 如果分数大于85.0且推荐人数超过10，返回true。
        // If the score is greater than 85.0 and referrals are more than 10, return true.
        if (score > 85.0 && referrals > 10) {
            return true;
        }

        // 如果经验超过5年且证书超过3个，或分数超过90.0且年龄超过30岁，返回true。
        // If experience is more than 5 years and certifications are more than 3, or if the score is more than 90.0 and age is more than 30, return true.
        if ((experience > 5 && certifications > 3) || (score > 90.0 && age > 30)) {
            return true;
        }

        // 如果年龄超过40岁且分数低于70，返回false。
        // If age is more than 40 and score is less than 70, return false.
        if (age > 40 && score < 70) {
            return false;
        }

        // 如果推荐人数少于5且经验少于2年，返回false。
        // If referrals are less than 5 and experience is less than 2 years, return false.
        if (referrals < 5 && experience < 2) {
            return false;
        }

        // 如果经验超过10年或年龄超过35岁，返回true。
        // Return true if experience is more than 10 years or age is more than 35 years.
        return experience > 10 || age > 35;
    }
}