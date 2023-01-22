package com;

/**
 * In this lesson U will learn that there are various
 * ways to handle variables and the their values and 
 * even perform different operations on them
 * e.x.
 * 1. Adding 2 numbers
 * 2. Finding monthly income
 * 3. Area of circle
 * etc.
 * */

public class Lesson4 {
	public static void main(String[] args) {
		//1. Adding 2 numbers
		
		int num1 = 34;
		int num2 = 59;
		
		System.out.println("SUM IS :: "+(num1+num2));
		
		//2. Finding monthly income
		int totalSalary = 1000000;
		float monthlySalaryWithPF = totalSalary/12;
		float PF = monthlySalaryWithPF * 3/100;
		float monthlySalary = monthlySalaryWithPF - PF;

		System.out.println("MONTHLY SALARY IS :: "+monthlySalary+" AND PF IS :: "+PF);
		
		//3. Area of Circle
		int radius = 4;
		double area = Math.PI * radius * radius;
		
		System.out.println("AREA OF CIRCLE :: "+area);
	}
}
