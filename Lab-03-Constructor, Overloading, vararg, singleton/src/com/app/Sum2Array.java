package com.app;

import java.util.Scanner;

public class Sum2Array {
	static Scanner sc = new Scanner(System.in);
	
	private static void array() {
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		System.out.println("Enter Array a :: ");
		int a[] = new int[size];
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Array b :: ");
		int b[] = new int[size];
		for(int i=0; i<size; i++)
		{
			b[i] = sc.nextInt();
		}
		System.out.println("Sum Array c is :: ");
		int c[] = new int[size];
		for(int i=0; i<size; i++)
		{
			c[i] = a[i]+b[i];
		}
		
		for(int i=0; i<c.length; i++)
		{
			System.out.print(" "+c[i]);
		}
	}
	public static void main(String[] args) {
		array();
	}
}
