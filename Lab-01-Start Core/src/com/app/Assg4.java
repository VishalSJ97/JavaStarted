package com.app;

public class Assg4 {
	public static void main(String[] args) {
		int basic = Integer.parseInt(args[0]);
		double incomeTax=0;
		
		if(basic > 0 && basic < 4000) {
			incomeTax = basic * 0.04;
		} else if(basic >= 4000  && basic < 10000) {
			incomeTax = basic * 0.06;
		} else if(basic >= 10000 && basic < 17000) {
			incomeTax = basic * 0.08;
		} else if(basic >= 17000 && basic < 27000) {
			incomeTax = basic * 0.1;
		} else if(basic >= 27000) {
			incomeTax = basic * 0.15;
		}
		
		System.out.println("Income Tax is :: "+incomeTax);
	}
}
