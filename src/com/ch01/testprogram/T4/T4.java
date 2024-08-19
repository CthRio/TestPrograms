package com.ch01.testprogram.T4;

/**
 * 项目说明
 *
 * Main 类: 包含主方法，演示了 ProcessManager、TaskScheduler、ResourceAllocator、
 *         LoadBalancer 和 SystemMonitor 的方法调用。
 * ProcessManager 类: 提供了系统资源管理和性能评估的复杂计算方法，包含多层次的条件判断。
 * TaskScheduler 类: 负责任务调度、任务复杂性计算和调度优化。
 * ResourceAllocator 类: 处理资源分配和优化，计算资源效率，并进行资源优化的判断。
 * LoadBalancer 类: 实现了服务器间负载均衡、资源分配和平衡优化的逻辑。
 * SystemMonitor 类: 监控系统性能，生成系统报告，评估系统健康状况，并计算系统效率。
 *
 * 项目的主要用途
 * 系统资源管理与优化: 项目模拟了系统资源管理、任务调度、负载均衡和系统监控的复杂逻辑。
 * 性能评估与监控: 通过多个类和方法，展示如何进行系统性能评估和优化，包括负载均衡和系统健康监控。
 * 软件测试验证: 该项目包含大量的复杂条件判断和多参数方法，适合用于软件测试和系统优化的验证。
 *
 * 总结
 * 这个项目设计涵盖了系统资源管理、负载均衡、任务调度和系统监控的复杂逻辑，通过多种复杂条件判断和多参数计算，
 * 模拟了实际系统中的管理与优化流程，适合用于测试、教育以及系统优化的研究和开发。
 */
public class T4 {  // ProcessManagerUtil
    public static void main(String[] args) {
        // 创建各类管理器实例
        // Create instances of various managers
        ProcessManager processManager = new ProcessManager();
        TaskScheduler taskScheduler = new TaskScheduler();
        ResourceAllocator resourceAllocator = new ResourceAllocator();
        LoadBalancer loadBalancer = new LoadBalancer();
        SystemMonitor systemMonitor = new SystemMonitor();

        // 计算CPU使用率并输出结果
        // Calculate CPU usage and print the result
        double cpuUsage = processManager.calculateCPUUsage(50, 30, 70, 80, 90);
        System.out.println("CPU Usage: " + cpuUsage);

        // 资源分配并输出分配状态
        // Allocate resources and print the allocation status
        boolean canAllocate = resourceAllocator.allocateResources(100, 200, 150, 80, 60);
        System.out.println("Resources Allocation Status: " + canAllocate);

        // 任务调度并输出调度计划
        // Schedule tasks and print the schedule
        String schedule = taskScheduler.scheduleTasks("Project A", 5, 3, 8, 6, 10);
        System.out.println(schedule);

        // 计算性能评分并输出结果
        // Calculate performance score and print the result
        double performanceScore = processManager.calculatePerformanceScore(10, 20, 30, 40, 50);
        System.out.println("Performance Score: " + performanceScore);

        // 进行负载均衡并输出均衡状态
        // Perform load balancing and print the balancing status
        boolean loadBalanced = loadBalancer.balanceLoadAcrossServers(75, 65, 85, 55, 60);
        System.out.println("Load Balancing Status: " + loadBalanced);

        // 生成系统报告并输出
        // Generate system report and print it
        String systemReport = systemMonitor.generateSystemReport(95, 85, 70, 90, 80);
        System.out.println(systemReport);
    }
}

class ProcessManager {
    // 计算CPU使用率
    // Calculate CPU usage
    public double calculateCPUUsage(int core1, int core2, int core3, int core4, int core5) {
        double totalUsage = 0;

        if (core1 > 50 && core2 > 50) {
            totalUsage = (core1 + core2) / 2.0;
        } else if (core3 > 60 || core4 > 60) {
            totalUsage = (core3 + core4 + core5) / 3.0;
        } else if (core1 > 70 && core5 > 70) {
            totalUsage = (core1 + core5) * 0.75;
        } else {
            totalUsage = (core1 + core2 + core3 + core4 + core5) / 5.0;
        }

        if (totalUsage > 80) {
            totalUsage *= 0.9;
        } else if (totalUsage < 50) {
            totalUsage += 10;
        }

        return totalUsage;
    }

    // 计算性能评分
    // Calculate performance score
    public double calculatePerformanceScore(int metric1, int metric2, int metric3, int metric4, int metric5) {
        double score = 0;

        if (metric1 > 20 && metric2 > 30) {
            score = (metric1 + metric2) * 0.8;
        } else if (metric3 > 40 || metric4 > 50) {
            score = metric3 * 1.2 + metric4 * 0.9;
        } else if (metric5 > 60 && metric2 < 20) {
            score = metric5 * 1.5 - metric2;
        } else {
            score = (metric1 + metric2 + metric3 + metric4 + metric5) / 5.0;
        }

        if (score > 100) {
            score *= 0.85;
        } else if (score < 30) {
            score += 15;
        }

        return score;
    }

    // 管理进程
    // Manage processes
    public boolean manageProcess(int memoryUsage, int diskSpace, int threadCount, int networkBandwidth, int ioOperations) {
        if (memoryUsage > 80 && diskSpace < 20) {
            return false;
        }

        if (threadCount > 100 || networkBandwidth < 50) {
            return true;
        }

        if ((memoryUsage > 70 && ioOperations > 1000) || (diskSpace > 50 && threadCount < 50)) {
            return true;
        }

        return memoryUsage < 90 && networkBandwidth > 55;
    }

    // 优化性能
    // Optimize performance
    public int optimizePerformance(int currentLoad, int maxLoad, int avgResponseTime, int errorRate, int downtime) {
        int optimizationLevel = 0;

        if (currentLoad > 80 && avgResponseTime > 300) {
            optimizationLevel += 10;
        } else if (errorRate > 5 || downtime > 10) {
            optimizationLevel += 20;
        } else if (currentLoad < 50 && errorRate < 3) {
            optimizationLevel += 5;
        } else {
            optimizationLevel += 15;
        }

        if (optimizationLevel > 15) {
            optimizationLevel *= 0.8;
        } else if (optimizationLevel < 10) {
            optimizationLevel += 5;
        }

        return optimizationLevel;
    }
}

class TaskScheduler {
    // 任务调度
    // Schedule tasks
    public String scheduleTasks(String taskName, int priority, int duration, int resources, int dependencies, int deadline) {
        StringBuilder schedule = new StringBuilder();
        schedule.append("Task Name: ").append(taskName).append("\n");
        schedule.append("Priority: ").append(priority).append("\n");
        schedule.append("Duration: ").append(duration).append(" hours\n");
        schedule.append("Resources: ").append(resources).append("\n");
        schedule.append("Dependencies: ").append(dependencies).append("\n");
        schedule.append("Deadline: ").append(deadline).append(" days\n");

        if (priority > 5 && deadline < 10) {
            schedule.append("Schedule: Urgent\n");
        } else if (resources > 7 || dependencies < 3) {
            schedule.append("Schedule: High Priority\n");
        } else {
            schedule.append("Schedule: Normal\n");
        }

        if (duration > 8) {
            schedule.append("Alert: Task Duration Exceeds 8 Hours!\n");
        }

        return schedule.toString();
    }

    // 计算任务复杂度
    // Calculate task complexity
    public double calculateTaskComplexity(int subTasks, int dependencies, int resourceAllocation, int riskFactor, int coordinationEffort) {
        double complexity = 0;

        if (subTasks > 10 && dependencies > 5) {
            complexity = subTasks * 2 + dependencies * 3;
        } else if (resourceAllocation > 20 || riskFactor > 50) {
            complexity = resourceAllocation * 1.5 + riskFactor * 2;
        } else if (coordinationEffort > 30 && subTasks < 5) {
            complexity = coordinationEffort * 2 + subTasks;
        } else {
            complexity = subTasks + dependencies + resourceAllocation + riskFactor + coordinationEffort;
        }

        if (complexity > 100) {
            complexity -= 20;
        } else if (complexity < 50) {
            complexity += 15;
        }

        return complexity;
    }

    // 检查任务可行性
    // Check task feasibility
    public boolean isTaskFeasible(int availableResources, int requiredResources, int timeAvailable, int timeRequired, int riskLevel) {
        if (availableResources < requiredResources && timeAvailable < timeRequired) {
            return false;
        }

        if (timeAvailable > timeRequired || riskLevel < 20) {
            return true;
        }

        return availableResources > requiredResources && timeRequired < 20;
    }

    // 优化调度
    // Optimize schedule
    public double optimizeSchedule(int taskCount, int resourceAvailability, int deadlinePressure, int teamSize, int riskLevel) {
        double optimizationScore = 0;

        if (taskCount > 10 && resourceAvailability < 50) {
            optimizationScore += 15;
        } else if (deadlinePressure > 60 || teamSize > 8) {
            optimizationScore += 25;
        } else if (riskLevel > 40 && resourceAvailability > 70) {
            optimizationScore += 20;
        } else {
            optimizationScore += 10;
        }

        if (optimizationScore > 30) {
            optimizationScore *= 0.9;
        } else if (optimizationScore < 15) {
            optimizationScore += 5;
        }

        return optimizationScore;
    }
}

class ResourceAllocator {
    // 资源分配
    // Allocate resources
    public boolean allocateResources(int cpu, int memory, int disk, int network, int io) {
        if (cpu < 50 && memory > 80) {
            return false;
        }

        if (disk < 20 || network < 30) {
            return false;
        }

        if (io > 1000 && cpu > 60) {
            return true;
        }

        return memory < 90 && disk > 40;
    }

    // 计算资源效率
    // Calculate resource efficiency
    public double calculateResourceEfficiency(int cpuUsage, int memoryUsage, int diskUsage, int networkUsage, int ioOperations) {
        double efficiency = 0;

        if (cpuUsage > 70 && memoryUsage < 50) {
            efficiency = cpuUsage * 0.8 + memoryUsage * 1.2;
        } else if (diskUsage > 60 || networkUsage > 70) {
            efficiency = diskUsage * 1.1 + networkUsage * 1.3;
        } else if (ioOperations > 1000 && cpuUsage < 50) {
            efficiency = ioOperations * 0.9 + cpuUsage * 1.1;
        } else {
            efficiency = (cpuUsage + memoryUsage + diskUsage + networkUsage + ioOperations) / 5.0;
        }

        if (efficiency > 90) {
            efficiency *= 0.9;
        } else if (efficiency < 50) {
            efficiency += 10;
        }

        return efficiency;
    }

    // 优化资源
    // Optimize resources
    public boolean optimizeResources(int cpuThreshold, int memoryThreshold, int diskThreshold, int networkThreshold, int ioThreshold) {
        if (cpuThreshold < 60 && memoryThreshold > 80) {
            return false;
        }

        if (diskThreshold < 30 || networkThreshold > 70) {
            return true;
        }

        if (ioThreshold > 1000 && cpuThreshold > 70) {
            return true;
        }

        return memoryThreshold < 90 && diskThreshold > 50;
    }

    // 分配动态资源
    // Allocate dynamic resources
    public int allocateDynamicResources(int cpuRequest, int memoryRequest, int diskRequest, int networkRequest, int ioRequest) {
        int allocationScore = 0;

        if (cpuRequest > 50 && memoryRequest < 70) {
            allocationScore += 10;
        } else if (diskRequest > 40 || networkRequest > 60) {
            allocationScore += 20;
        } else if (ioRequest > 1000 && cpuRequest < 50) {
            allocationScore += 15;
        } else {
            allocationScore += 5;
        }

        if (allocationScore > 18) {
            allocationScore -= 10;
        } else if (allocationScore < 10) {
            allocationScore += 5;
        }

        return allocationScore;
    }
}

class LoadBalancer {
    // 跨服务器平衡负载
    // Balance load across servers
    public boolean balanceLoadAcrossServers(int server1Load, int server2Load, int server3Load, int server4Load, int server5Load) {
        int totalLoad = server1Load + server2Load + server3Load + server4Load + server5Load;
        int avgLoad = totalLoad / 5;

        if (avgLoad > 80) {
            return false;
        }

        if (server1Load > 90 || server5Load < 50) {
            return true;
        }

        if (server2Load > 75 && server4Load < 60) {
            return true;
        }

        return avgLoad < 70 && server3Load > 55;
    }

    // 计算负载分布
    // Calculate load distribution
    public double calculateLoadDistribution(int server1Load, int server2Load, int server3Load, int server4Load, int server5Load) {
        double distributionScore = 0;

        if (server1Load > 70 && server2Load < 50) {
            distributionScore += 10;
        } else if (server3Load > 60 || server4Load > 70) {
            distributionScore += 20;
        } else if (server5Load > 80 && server1Load < 60) {
            distributionScore += 15;
        } else {
            distributionScore += 5;
        }

        if (distributionScore > 30) {
            distributionScore *= 0.8;
        } else if (distributionScore < 10) {
            distributionScore += 5;
        }

        return distributionScore;
    }

    // 优化负载均衡
    // Optimize load balance
    public boolean optimizeLoadBalance(int currentLoad, int maxLoad, int avgLoad, int peakLoad, int idleLoad) {
        if (currentLoad > 80 && peakLoad > 90) {
            return false;
        }

        if (avgLoad < 70 && idleLoad > 50) {
            return true;
        }

        return maxLoad > 85 && currentLoad < 75;
    }

    // 跨服务器平衡资源
    // Balance resources across servers
    public int balanceResourcesAcrossServers(int server1Resource, int server2Resource, int server3Resource, int server4Resource, int server5Resource) {
        int balanceScore = 0;

        if (server1Resource > 60 && server2Resource < 40) {
            balanceScore += 10;
        } else if (server3Resource > 50 || server4Resource > 70) {
            balanceScore += 20;
        } else if (server5Resource > 80 && server1Resource < 50) {
            balanceScore += 15;
        } else {
            balanceScore += 5;
        }

        if (balanceScore > 18) {
            balanceScore -= 5;
        } else if (balanceScore < 10) {
            balanceScore += 10;
        }

        return balanceScore;
    }
}

class SystemMonitor {
    // 生成系统报告
    // Generate system report
    public String generateSystemReport(int cpuUsage, int memoryUsage, int diskUsage, int networkUsage, int ioOperations) {
        StringBuilder report = new StringBuilder();
        report.append("System Report:\n");
        report.append("CPU Usage: ").append(cpuUsage).append("%\n");
        report.append("Memory Usage: ").append(memoryUsage).append("%\n");
        report.append("Disk Usage: ").append(diskUsage).append("%\n");
        report.append("Network Usage: ").append(networkUsage).append("%\n");
        report.append("IO Operations: ").append(ioOperations).append("\n");

        if (cpuUsage > 90) {
            report.append("Warning: CPU Usage Exceeds 90%\n");
        }

        if (memoryUsage > 80) {
            report.append("Warning: Memory Usage Exceeds 80%\n");
        }

        if (diskUsage < 50 && ioOperations > 1000) {
            report.append("Performance: Disk Usage Low, IO Operations High\n");
        } else if (networkUsage > 75) {
            report.append("Performance: Network Usage High\n");
        } else {
            report.append("Performance: System Running Normally\n");
        }

        return report.toString();
    }

    // 评估系统健康状况
    // Evaluate system health
    public int evaluateSystemHealth(int cpuLoad, int memoryLoad, int diskLoad, int networkLoad, int ioLoad) {
        int healthScore = 0;

        if (cpuLoad > 70 && memoryLoad < 50) {
            healthScore += 10;
        } else if (diskLoad > 60 || networkLoad > 70) {
            healthScore += 20;
        } else if (ioLoad > 1000 && cpuLoad < 50) {
            healthScore += 15;
        } else {
            healthScore += 5;
        }

        if (healthScore > 18) {
            healthScore *= 0.8;
        } else if (healthScore < 10) {
            healthScore += 5;
        }

        return healthScore;
    }

    // 监控系统性能
    // Monitor system performance
    public boolean monitorSystemPerformance(int cpuUsage, int memoryUsage, int diskUsage, int networkUsage, int ioOperations) {
        if (cpuUsage > 80 && memoryUsage < 50) {
            return false;
        }

        if (diskUsage > 60 || networkUsage > 70) {
            return true;
        }

        return ioOperations > 1000 && cpuUsage < 50;
    }

    // 计算系统效率
    // Calculate system efficiency
    public double calculateSystemEfficiency(int cpuEfficiency, int memoryEfficiency, int diskEfficiency, int networkEfficiency, int ioEfficiency) {
        double overallEfficiency = 0;

        if (cpuEfficiency > 70 && memoryEfficiency < 50) {
            overallEfficiency += cpuEfficiency * 0.8 + memoryEfficiency * 1.2;
        } else if (diskEfficiency > 60 || networkEfficiency > 70) {
            overallEfficiency += diskEfficiency * 1.1 + networkEfficiency * 1.3;
        } else if (ioEfficiency > 1000 && cpuEfficiency < 50) {
            overallEfficiency += ioEfficiency * 0.9 + cpuEfficiency * 1.1;
        } else {
            overallEfficiency = (cpuEfficiency + memoryEfficiency + diskEfficiency + networkEfficiency + ioEfficiency) / 5.0;
        }

        if (overallEfficiency > 90) {
            overallEfficiency *= 0.9;
        } else if (overallEfficiency < 50) {
            overallEfficiency += 10;
        }

        return overallEfficiency;
    }
}