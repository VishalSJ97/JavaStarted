package com.app;

public class Assg5 {
	
	public static void main(String[] args) {
		int input=5;
		int sum = 0;
		
		for(int i=0; i<input; i++)
		{
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("SUM is :: "+sum);
	}
}
