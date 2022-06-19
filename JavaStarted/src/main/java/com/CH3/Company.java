package com.CH3;

import java.util.*;

class Employee {
    int empId;
    String empName;
    double empBasicSalary;
    double HRA;
    double pf;
    double pt;
    double grossSalary;

    public Employee() {
    }

    protected double valueHRA(double empBasicSalary) {
        HRA = (50.0/100) * empBasicSalary;
        return HRA;
    }

    protected double valueGrossSalary(double empBasicSalary, double HRA) {
        grossSalary = empBasicSalary + HRA;
        return grossSalary;
    }

    protected double valuePF(double empBasicSalary) {
        pf = (12.0/100) * empBasicSalary;
        return pf;
    }

    protected double valuePT() {
        return pt = 200;
    }

    protected String nameGenerator() {
        String upperAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabets = "abcdefghijklmnopqstuvwxyz";
        String number = "123456789";

        String combineAllAlphabet = upperAlphabets + lowerAlphabets + number;

        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        int length = 15;
        for(int i=0; i<length; i++) {
            int index = random.nextInt(combineAllAlphabet.length());
            char randChar = combineAllAlphabet.charAt(index);
            sb.append(randChar);
        }
        return sb.toString();
    }

    protected int idGenerator() {
        int min = 1000;
        int max = 9999;

        return (int)(Math.random() * (max - min + 1)+min);
    }

    protected double salaryGenerator() {
        int min = 20000;
        int max = 80000;

        return (int)(Math.random() * (max - min + 1)+min);
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e = new Employee();
        for(int i=0; i<10; i++) {
            int id = e.idGenerator();
            String name = e.nameGenerator();
            double salary = e.salaryGenerator();
            double hra = e.valueHRA(salary);
            double pf = e.valuePF(salary);
            double pt = e.valuePT();
            double gSal = e.valueGrossSalary(salary, hra);

            System.out.println("Employee :: [empId :: "+id+", empName :: '"+name+"', empBasicSalary :: "+salary+
                    ", HRA :: "+hra+", pf :: "+pf+", pt :: "+pt+", grossSalary :: "+gSal+']');
        }
    }
}