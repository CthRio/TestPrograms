package com.ch01.testprogram.T3;

public class ReportGenerator {

    // 这个方法生成一个报告，包含标题和五个指标的值。
    // This method generates a report containing the title and the values of five metrics.
    public String generateReport(String title, int metric1, int metric2, int metric3, int metric4, int metric5) {
        StringBuilder report = new StringBuilder();  // 使用StringBuilder来构建报告内容。
        // Use StringBuilder to build the report content.
        report.append("Report Title: ").append(title).append("\n");  // 添加报告标题。
        // Add the report title.
        report.append("Metric 1: ").append(metric1).append("\n");  // 添加指标1的值。
        // Add the value of metric 1.
        report.append("Metric 2: ").append(metric2).append("\n");  // 添加指标2的值。
        // Add the value of metric 2.
        report.append("Metric 3: ").append(metric3).append("\n");  // 添加指标3的值。
        // Add the value of metric 3.
        report.append("Metric 4: ").append(metric4).append("\n");  // 添加指标4的值。
        // Add the value of metric 4.
        report.append("Metric 5: ").append(metric5).append("\n");  // 添加指标5的值。
        // Add the value of metric 5.

        // 根据指标1和指标2的值评估性能。
        // Evaluate performance based on the values of metric 1 and metric 2.
        if (metric1 > 5000 && metric2 < 10000) {
            report.append("Performance: Satisfactory\n");  // 如果指标1大于5000且指标2小于10000，性能为“满意”。
            // If metric 1 is greater than 5000 and metric 2 is less than 10000, performance is "Satisfactory".
        }
        // 根据指标3或指标4的值评估性能。
        // Evaluate performance based on the values of metric 3 or metric 4.
        else if (metric3 > 15000 || metric4 > 12000) {
            report.append("Performance: Excellent\n");  // 如果指标3大于15000或指标4大于12000，性能为“优秀”。
            // If metric 3 is greater than 15000 or metric 4 is greater than 12000, performance is "Excellent".
        }
        // 否则，性能需要改进。
        // Otherwise, performance needs improvement.
        else {
            report.append("Performance: Needs Improvement\n");
        }

        // 如果指标5的值超过20000，添加警告信息。
        // If the value of metric 5 exceeds 20000, add an alert message.
        if (metric5 > 20000) {
            report.append("Alert: Metric 5 exceeds threshold!\n");
        }

        return report.toString();  // 返回生成的报告。
        // Return the generated report.
    }

    // 这个方法根据销售额、收入、增长率、留存率和客户满意度生成一个绩效评分。
    // This method generates a performance score based on sales, revenue, growth, retention, and customer satisfaction.
    public double generatePerformanceScore(int sales, int revenue, int growth, int retention, int customerSatisfaction) {
        double score = 0;

        // 根据销售额和收入的值计算得分。
        // Calculate the score based on the values of sales and revenue.
        if (sales > 10000 && revenue > 15000) {
            score += sales * 0.5 + revenue * 0.3;
        }
        // 根据增长率和留存率的值计算得分。
        // Calculate the score based on the values of growth and retention.
        else if (growth > 5) {
            score += growth * 0.7 + retention * 0.2;
        }
        // 否则，根据所有指标的总和计算得分。
        // Otherwise, calculate the score based on the sum of all metrics.
        else {
            score = sales + revenue + growth + retention + customerSatisfaction;
        }

        // 如果客户满意度高于90，得分乘以1.1倍。
        // If customer satisfaction is above 90, multiply the score by 1.1.
        if (customerSatisfaction > 90) {
            score *= 1.1;
        }
        // 如果客户满意度低于70，得分乘以0.9倍。
        // If customer satisfaction is below 70, multiply the score by 0.9.
        else if (customerSatisfaction < 70) {
            score *= 0.9;
        }

        return score;  // 返回计算的绩效评分。
        // Return the calculated performance score.
    }

    // 这个方法生成一个详细的报告，包含基础报告和进一步的分析。
    // This method generates a detailed report, including the base report and further analysis.
    public String generateDetailedReport(String title, int metric1, int metric2, int metric3, int metric4, int metric5) {
        StringBuilder report = new StringBuilder();
        report.append(generateReport(title, metric1, metric2, metric3, metric4, metric5)).append("\n");

        // 如果指标1的值超过8000，添加超出预期的注释。
        // If the value of metric 1 exceeds 8000, add a note that it exceeded expectations.
        if (metric1 > 8000) {
            report.append("Metric 1 exceeded expectations.\n");
        }
        // 否则，指标1需要改进。
        // Otherwise, metric 1 needs improvement.
        else {
            report.append("Metric 1 needs improvement.\n");
        }

        // 如果指标2和指标3的值分别超过10000和12000，添加联合指标表现强劲的注释。
        // If the values of metric 2 and metric 3 exceed 10000 and 12000 respectively, add a note that combined metrics 2 and 3 show strong performance.
        if (metric2 > 10000 && metric3 > 12000) {
            report.append("Combined Metrics 2 and 3 show strong performance.\n");
        }

        return report.toString();  // 返回生成的详细报告。
        // Return the generated detailed report.
    }
}