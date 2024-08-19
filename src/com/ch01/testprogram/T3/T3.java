package com.ch01.testprogram.T3;

import java.util.Map;

public class T3 {  // EmployeeWorkstation
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ReportGenerator reportGenerator = new ReportGenerator();
        DataAnalyzer dataAnalyzer = new DataAnalyzer();
        ScoreEvaluator scoreEvaluator = new ScoreEvaluator();
        EmployeeManager employeeManager = new EmployeeManager();

        // Test Calculator
        double result1 = calculator.complexCalculation(15, 20, 35, 5, 10);
        System.out.println("Complex Calculation Result 1: " + result1);

        double result2 = calculator.complexCalculation(5, 10, 15, 25, 30);
        System.out.println("Complex Calculation Result 2: " + result2);

        double result3 = calculator.complexCalculation(30, 10, 5, 2, 1);
        System.out.println("Complex Calculation Result 3: " + result3);

        boolean isEligible = calculator.checkEligibility(28, 5, 3, 75.5, 89);
        System.out.println("Eligibility: " + isEligible);

        boolean isEligible2 = calculator.checkEligibility(22, 2, 1, 92.5, 15);
        System.out.println("Eligibility 2: " + isEligible2);

        // Test ReportGenerator
        String report = reportGenerator.generateReport("Monthly Sales", 5000, 7000, 10000, 15000, 20000);
        System.out.println(report);

        double performanceScore = reportGenerator.generatePerformanceScore(12000, 16000, 8, 85, 95);
        System.out.println("Performance Score: " + performanceScore);

        String detailedReport = reportGenerator.generateDetailedReport("Quarterly Performance", 6000, 8000, 9000, 14000, 21000);
        System.out.println(detailedReport);

        // Test DataAnalyzer
        int[] data = {12, 45, 67, 23, 89, 54, 29};
        double averageAboveThreshold = dataAnalyzer.analyzeData(data, 50);
        System.out.println("Average of values above threshold: " + averageAboveThreshold);

        int maxValue = dataAnalyzer.findMaxValue(data);
        System.out.println("Max Value: " + maxValue);

        int minValue = dataAnalyzer.findMinValue(data);
        System.out.println("Min Value: " + minValue);

        double medianValue = dataAnalyzer.calculateMedian(data);
        System.out.println("Median Value: " + medianValue);

        Map<String, Integer> frequencyMap = dataAnalyzer.calculateFrequency(data);
        System.out.println("Frequency Map: " + frequencyMap);

        // Test ScoreEvaluator
        String scoreEvaluation = scoreEvaluator.evaluateScore(82);
        System.out.println("Score Evaluation: " + scoreEvaluation);

        boolean isPassing = scoreEvaluator.isPassingScore(58);
        System.out.println("Is Passing Score: " + isPassing);

        double gradePoint = scoreEvaluator.calculateGradePoint(87, 100);
        System.out.println("Grade Point: " + gradePoint);

        boolean isEligibleForScholarship = scoreEvaluator.isEligibleForScholarship(95, 4.8, true);
        System.out.println("Eligible for Scholarship: " + isEligibleForScholarship);

        // Test EmployeeManager
        String promotionStatus = employeeManager.determinePromotion(12, 25, 4.7, 5, 6);
        System.out.println("Promotion Status: " + promotionStatus);

        double bonus = employeeManager.calculateBonus(60000, 8, 4.3);
        System.out.println("Bonus: " + bonus);

        boolean eligibleForRaise = employeeManager.isEligibleForRaise(3, 45000, 3.8);
        System.out.println("Eligible for Raise: " + eligibleForRaise);

        String retentionStatus = employeeManager.evaluateRetentionRisk(15, 60000, 4.5, true, 3);
        System.out.println("Retention Risk: " + retentionStatus);
    }
}