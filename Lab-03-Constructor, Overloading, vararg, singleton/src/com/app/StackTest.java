package com.app;

import java.util.Scanner;

class Stack {
	int stack[] = new int[5];
	int count=-1;
	
	public void push(int num)
	{
		count++;
		if(count < 5)
		{
			stack[count] = num;
		} else if(count == 5)
		{
			System.out.println("Stack full Number cannot be added");
			count--;
		}
	}
	
	public void pop()
	{
		if(count > -1)
		{
			System.out.println("Item deleted ");
			stack[count] = 0;
			count--;
		} else if(count==-1)
		{
			System.out.println("Stack Empty");
		}
	}
	
	public void display()
	{
		for(int i=0; i<=count; i++)
		{
			System.out.print(" "+stack[i]);
		}
	}
	
	public void retrive(int pos)
	{
		if(pos <= count)
		{
			System.out.println(" "+stack[pos-1]);
		} else {
			System.out.println("Not int stack");
		}
	}
}

public class StackTest {
	public static void main(String[] args) {
		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);
		String ch;
		int num;
		do
		{
			System.out.println("----------MENU----------");
			System.out.println("NOTE :: Stack is of only 5 elements");
			System.out.println("1.PUSH\n2.POP\n3.Retrive\n4.Display\nEnter your choice :: ");
			int cho = sc.nextInt();
			switch(cho)
			{
			case 1:
				System.out.println("Enter number to push :: ");
				num = sc.nextInt();
				s.push(num);
				break;
			case 2:
				s.pop();
				break;
			case 3:
				System.out.println("Enter the position of element you want to retrive :: ");
				int pos = sc.nextInt();
				s.retrive(pos);
				break;
			case 4:
				System.out.println("Stack is :: ");
				s.display();
				System.out.println();
				break;
			default:
				System.out.println("Enter valid option");
				break;
			}
			System.out.println("Do you want to continue y/n :: ");
			ch = sc.next();
		}while(ch.equals("y") || ch.equals("Y"));
		sc.close();
	}
}
