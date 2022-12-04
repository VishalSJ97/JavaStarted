package com.app;

public class Assg3 {
	
	public static void main(String[] args) {
		int basicSalary = Integer.parseInt(args[0]);
		
		double da = basicSalary * 0.2;
		double hra = basicSalary * 0.3;
		
		double grossSalary = basicSalary + da + hra;
		System.out.println("Gross Salary is :: "+grossSalary);
	}
	
}
