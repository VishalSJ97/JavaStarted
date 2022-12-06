package com.app;

import java.util.Scanner;

public class Assg6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements you want :: ");
		int ele = sc.nextInt();
		int num1=1, num2=1, num3;
		
		System.out.print(num1+" "+num2);
		while(ele!=2)
		{
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			System.out.print(" "+num3);
			ele--;
		}
		sc.close();
	}
}
