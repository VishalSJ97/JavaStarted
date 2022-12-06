package com.app;

import java.util.Scanner;

public class Assg2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year for checking");
		int year = sc.nextInt();
		
		if(year%4 == 0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("non Leap year");
		}
		sc.close();
	}
}
