package com.CH4;

public class EmpArr {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        for(int i=0; i<employees.length; i++) {
            employees[i] = new Employee(14751, "Vishal Jadhav", new DOB(12,06,2020));
        }
    }
}
