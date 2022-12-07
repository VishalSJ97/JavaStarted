package com.app;

import java.util.Scanner;

class Emp
{
	private int empId;
	private String empName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netSalary;
	private double grossSalary;
	
	public Emp() {
		
	}

	public Emp(int empId, String empName, double basicSalary, double hra, double medical, double pf, double pt,
			double netSalary, double grossSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.medical = medical;
		this.pf = pf;
		this.pt = pt;
		this.netSalary = netSalary;
		this.grossSalary = grossSalary;
	}
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", hra=" + hra
				+ ", medical=" + medical + ", pf=" + pf + ", pt=" + pt + ", netSalary=" + netSalary + ", grossSalary="
				+ grossSalary + "]";
	}
	
}

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id :: ");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee name :: ");
		String empName = sc.nextLine();
		System.out.println("Enter Employee Basic Salary :: ");
		double bSal = sc.nextDouble();
		System.out.println("Enter Medical bills :: ");
		double medical = sc.nextDouble();
		
		double hra = 0.5*bSal;
		double pf = 0.12*bSal;
		double pt = 200;
		double grossSalary = bSal + hra + medical;
		double netSalary = grossSalary-(pf+pt);
		
		Emp e = new Emp(empId, empName, bSal, hra, medical, pf, pt, netSalary, grossSalary);
		System.out.println(e);
		
		sc.close();
	}
}
