package com.app;

import java.util.Scanner;

public class Assg1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the person :: ");
		int age = sc.nextInt();
		
		if(age >= 21)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not Eligible for voting");
		}
		
		sc.close();
	}
}
