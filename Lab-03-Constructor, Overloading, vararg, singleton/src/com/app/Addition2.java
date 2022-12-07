package com.app;

public class Addition2
{
	public static void add (int...num)
	{
		int sum=0;
		for(int i:num)
		{
			sum += i;
		}
		System.out.println("Sum of int is :: "+sum);
	}
	
	public static void add(double...num)
	{
		double sum=0.0;
		for(double i: num)
		{
			sum +=i;
		}
		System.out.println("Sum of float is :: "+sum);
	}
	
	public static void main(String[] args) {
		add(10,20,30);
		add(50,60,70,60,90,50,10,100);
		add(10.25,25.3697,31.25);
		add(10.25,25.3697,65.47,36.2147,36.21,0.30);
	}
}