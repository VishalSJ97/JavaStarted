package com.CH5;

public class SalesPerson extends WageEmployee {
    int sales;
    int commission;

    private void getSalesPersonDetails() {
        System.out.println("Total Sales of SalesPerson :: ");
        sales = sc.nextInt();
        System.out.println("Commission over each sales :: ");
        commission = sc.nextInt();
    }

    void computeSalary() {
        getSalesPersonDetails();
        int salary = sales * commission;
        System.out.println("SALARY OF THE SALES PERSON :: "+salary);
    }
}
