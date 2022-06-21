package com.CH5;

public class WageEmployee extends Employee{
    int hrs;
    int rate;

    private void getWagesPerHour() {
        System.out.println("Enter the rate per hour :: ");
        rate = sc.nextInt();
        System.out.println("Total hrs for Today :: ");
        hrs = sc.nextInt();
    }

    void computeSalary() {
        getWagesPerHour();
        int salary = rate * hrs;
        System.out.println("SALARY BASED ON WAGES :: "+salary);
    }
}
