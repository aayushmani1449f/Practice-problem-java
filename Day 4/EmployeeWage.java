package com.employee.wage;

public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;

        int totalSalary = 0;
        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < 100 && totalDays < 20) {
            totalDays++;

            int empCheck = (int) (Math.random() * 3);
            int empHours = 0;

            switch (empCheck) {
                case 1:
                    empHours = fullDayHour;
                    break;
                case 2:
                    empHours = partTimeHour;
                    break;
                default:
                    empHours = 0;
            }

            totalHours += empHours;
            int dailyWage = empHours * wagePerHour;
            totalSalary += dailyWage;

            System.out.println("Day " + totalDays + " Hours: " + empHours + " Wage: " + dailyWage);
        }

        System.out.println("Total Days: " + totalDays);
        System.out.println("Total Hours: " + totalHours);
        System.out.println("Total Salary: " + totalSalary);
    }
}