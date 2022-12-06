package com.app;

import java.util.Scanner;

public class Assg4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		int num = sc.nextInt();
		int newnum = num;
		int rem,arm=0;
		while(num != 0)
		{
			rem = num%10;
			arm += rem * rem * rem;
			num = num/10;
		}
		if(arm == newnum)
		{
			System.out.println("Armstrong number :: "+newnum);
		}
		else
		{
			System.out.println("not an armstrong number :: "+newnum);
		}
		sc.close();
	}
}
