package com.app;

class Single {
	/**
	 * to get single instance use this to create obj and return it
	 * */
	static Single obj = new Single();
	
	/** 2.
	 * while creating new object we use
	 * Single obj1 = new Single();
	 * where Single() - is public so, make it private
	 * */
	private Single()
	{
		
	}
	
	public static Single getInstance()
	{
		return obj;
	}
	public void display()
	{
		System.out.println("Singleton");
	}
}

public class SingleTon {
	public static void main(String[] args) {
		Single obj = Single.getInstance();
		obj.display();
	}
}
