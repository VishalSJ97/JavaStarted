package com.app;

import java.util.Scanner;

public class Assg3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial :: ");
		int num = sc.nextInt();
		int a = num;
		int fact = 1;
		
		while(num!=0)
		{
			fact = fact * num;
			num--;
		}
		System.out.println("Factorial of "+a+" is :: "+fact);
		
		sc.close();
	}
}
