package com.CH5;

import java.util.Scanner;

public class Employee {
    int id;
    String name;
    double salary;
    static Scanner sc;

    Employee(){
        sc = new Scanner(System.in);
    }

    void setEmpData() {
        System.out.println("Enter the id :: ");
        id = sc.nextInt();
        System.out.println("Enter the name :: ");
        sc.next();
        name = sc.nextLine();
        System.out.println("Enter the salary :: ");
        salary = sc.nextDouble();
    }
}
