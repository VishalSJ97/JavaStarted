package com.app;

import java.util.Scanner;

class Test {
	String accholder;
	double balance;
	
	public Test() {
		accholder = "vishal";
		balance = 50000;
	}
	
	public Test(String accholder, double balance) {
		super();
		this.accholder = accholder;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accholder=" + accholder + ", balance=" + balance + "]";
	}
	
	public void deposit(int amount)
	{
		balance += amount;
		System.out.println("New Balance is :: "+balance);
	}
	
	public void withdraw(int amount)
	{
		balance -= amount;
		if(balance <= 500)
		{
			System.out.println("Not enough amount to withdraw");
			System.out.println("500 must be kept in account");
			balance += amount;
		}
		else
		{
			System.out.println("Withdrawn amount is :: "+amount);
			System.out.println("Balance left is :: "+balance);
		}
	}
}

public class Account 
{
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation \n1.Withdraw\n2.Deposit\n3.Exit");
		int op = sc.nextInt();
		if(op == 1)
		{
			System.out.println("Enter amount to withdraw :: ");
			int amount = sc.nextInt();
			t.withdraw(amount);
		} else if(op == 2)
		{
			System.out.println("Enter amount to deposit :: ");
			int amount = sc.nextInt();
			t.deposit(amount);
		} else if(op >= 3)
		{
			System.exit(0);
		}
		sc.close();
	}
}
