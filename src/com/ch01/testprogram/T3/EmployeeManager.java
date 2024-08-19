package com.ch01.testprogram.T3;

public class EmployeeManager {

    // 这个方法确定员工是否有资格晋升。
    // This method determines if an employee is eligible for promotion.
    public String determinePromotion(int yearsWorked, int projectsCompleted, double rating, int teamLeadExperience, int certifications) {
        // 如果工作年限超过10年，评分高于4.5，并且完成了超过20个项目，晋升为高级管理层。
        // If worked for more than 10 years, rating above 4.5, and completed more than 20 projects, eligible for Senior Management.
        if (yearsWorked > 10 && rating > 4.5 && projectsCompleted > 20) {
            return "Eligible for Senior Management";
        }
        // 如果工作年限超过5年，评分高于4.0，并且有超过3年的团队领导经验，晋升为团队领导。
        // If worked for more than 5 years, rating above 4.0, and more than 3 years of team lead experience, eligible for Team Lead.
        else if (yearsWorked > 5 && rating > 4.0 && teamLeadExperience > 3) {
            return "Eligible for Team Lead";
        }
        // 如果完成了超过10个项目或拥有超过5个证书，晋升为中级职位。
        // If completed more than 10 projects or has more than 5 certifications, eligible for Mid-Level Promotion.
        else if (projectsCompleted > 10 || certifications > 5) {
            return "Eligible for Mid-Level Promotion";
        }
        // 否则，不符合晋升条件。
        // Otherwise, no promotion.
        else {
            return "No Promotion";
        }
    }

    // 这个方法计算员工的奖金。
    // This method calculates the employee's bonus.
    public double calculateBonus(int salary, int yearsWorked, double performanceRating) {
        double bonus;

        // 如果工作年限超过10年且绩效评分高于4.5，奖金为工资的20%。
        // If worked for more than 10 years and performance rating above 4.5, bonus is 20% of the salary.
        if (yearsWorked > 10 && performanceRating > 4.5) {
            bonus = salary * 0.2;
        }
        // 如果工作年限超过5年，奖金为工资的10%。
        // If worked for more than 5 years, bonus is 10% of the salary.
        else if (yearsWorked > 5) {
            bonus = salary * 0.1;
        }
        // 如果绩效评分高于4.0，奖金为工资的15%。
        // If performance rating above 4.0, bonus is 15% of the salary.
        else if (performanceRating > 4.0) {
            bonus = salary * 0.15;
        }
        // 否则，奖金为工资的5%。
        // Otherwise, bonus is 5% of the salary.
        else {
            bonus = salary * 0.05;
        }

        // 如果工资超过100000并且工作年限超过15年，奖金增加5000。
        // If salary is more than 100000 and worked for more than 15 years, add 5000 to the bonus.
        if (salary > 100000 && yearsWorked > 15) {
            bonus += 5000;
        }

        return bonus;  // 返回计算的奖金。
        // Return the calculated bonus.
    }

    // 这个方法检查员工是否有资格加薪。
    // This method checks if an employee is eligible for a raise.
    public boolean isEligibleForRaise(int yearsWorked, double currentSalary, double performanceRating) {
        // 如果工作年限超过5年且绩效评分高于4.0，则有资格加薪。
        // If worked for more than 5 years and performance rating above 4.0, eligible for a raise.
        if (yearsWorked > 5 && performanceRating > 4.0) {
            return true;
        }

        // 如果当前工资低于50000且绩效评分高于3.5，则有资格加薪。
        // If current salary is less than 50000 and performance rating above 3.5, eligible for a raise.
        if (currentSalary < 50000 && performanceRating > 3.5) {
            return true;
        }

        // 如果工作年限超过8年且当前工资低于60000，则有资格加薪。
        // If worked for more than 8 years and current salary is less than 60000, eligible for a raise.
        if (yearsWorked > 8 && currentSalary < 60000) {
            return true;
        }

        return false;  // 否则，不符合加薪条件。
        // Otherwise, not eligible for a raise.
    }

    // 这个方法评估员工的留任风险。
    // This method evaluates the retention risk of an employee.
    public String evaluateRetentionRisk(int yearsWorked, double salary, double rating, boolean recentPromotion, int teamSize) {
        // 如果工作年限超过10年且工资低于50000，风险为高。
        // If worked for more than 10 years and salary is less than 50000, the risk is High.
        if (yearsWorked > 10 && salary < 50000) {
            return "High Risk";
        }

        // 如果评分低于3.0且最近没有晋升，风险为中。
        // If rating is less than 3.0 and no recent promotion, the risk is Medium.
        if (rating < 3.0 && !recentPromotion) {
            return "Medium Risk";
        }

        // 如果团队规模小于5且工资低于70000，风险为低。
        // If team size is less than 5 and salary is less than 70000, the risk is Low.
        if (teamSize < 5 && salary < 70000) {
            return "Low Risk";
        }

        return "Stable";  // 否则，员工状态为稳定。
        // Otherwise, the employee's status is Stable.
    }
}