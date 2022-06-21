package com.CH5;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpData();
        Manager m = new Manager();
        m.computeSalary();
        SalesPerson s = new SalesPerson();
        s.computeSalary();
        WageEmployee w = new WageEmployee();
        w.computeSalary();
    }
}
