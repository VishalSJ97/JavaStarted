package com.app;

public class Assg1 {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c;
		// this is a comment
		c = a+b;
		System.out.println(a+" + "+b+" = "+c);
		c = a-b;
		System.out.println(a+" - "+b+" = "+c);
		c = a*b;
		System.out.println(a+" * "+b+" = "+c);
		c = a/b;
		System.out.println(a+" / "+b+" = "+c);
		c = a%b;
		System.out.println(a+" % "+b+" = "+c);
	}

}
