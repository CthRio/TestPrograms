package com.ch01.testprogram.T3;

public class ScoreEvaluator {

    // 这个方法根据得分评估成绩水平。
    // This method evaluates the performance level based on the score.
    public String evaluateScore(int score) {
        // 如果得分大于90，返回“优秀”。
        // If the score is greater than 90, return "Excellent".
        if (score > 90) {
            return "Excellent";
        }
        // 如果得分大于75，返回“良好”。
        // If the score is greater than 75, return "Good".
        else if (score > 75) {
            return "Good";
        }
        // 如果得分大于50，返回“中等”。
        // If the score is greater than 50, return "Average".
        else if (score > 50) {
            return "Average";
        }
        // 否则，返回“差”。
        // Otherwise, return "Poor".
        else {
            return "Poor";
        }
    }

    // 这个方法检查得分是否及格。
    // This method checks if the score is a passing score.
    public boolean isPassingScore(int score) {
        return score >= 60;  // 如果得分大于等于60，返回true，否则返回false。
        // Return true if the score is greater than or equal to 60, otherwise return false.
    }

    // 这个方法根据得分和总分计算绩点。
    // This method calculates the grade point based on the score and total points.
    public double calculateGradePoint(int score, int total) {
        double percentage = (double) score / total * 100;  // 计算得分的百分比。
        // Calculate the percentage of the score.

        // 根据百分比计算绩点。
        // Calculate the grade point based on the percentage.
        if (percentage >= 90) {
            return 4.0;
        } else if (percentage >= 80) {
            return 3.5;
        } else if (percentage >= 70) {
            return 3.0;
        } else if (percentage >= 60) {
            return 2.5;
        } else {
            return 2.0;
        }
    }

    // 这个方法检查是否符合奖学金申请资格。
    // This method checks if the score is eligible for a scholarship.
    public boolean isEligibleForScholarship(int score, double gpa, boolean extracurriculars) {
        // 如果得分超过90，GPA超过4.0，并且有课外活动，返回true。
        // Return true if the score is over 90, GPA is above 4.0, and there are extracurricular activities.
        if (score > 90 && gpa > 4.0 && extracurriculars) {
            return true;
        }

        // 如果GPA超过3.8，得分超过85，并且有课外活动，返回true。
        // Return true if GPA is above 3.8, score is over 85, and there are extracurricular activities.
        if (gpa > 3.8 && score > 85 && extracurriculars) {
            return true;
        }

        return false;  // 否则返回false，不符合奖学金申请资格。
        // Otherwise, return false, indicating not eligible for a scholarship.
    }
}