package com.CH5;

public class Manager extends Employee {
    int fixedSalary;
    int incentives;

    private void getManagerSalary() {
        System.out.println("Enter Manager fixed Salary :: ");
        fixedSalary = sc.nextInt();
        System.out.println("Enter Manager Incentives :: ");
        incentives = sc.nextInt();
    }

    void computeSalary() {
        getManagerSalary();
        int salary = fixedSalary + incentives;
        System.out.println("SALARY OF MANAGER IS :: "+salary);
    }
}
