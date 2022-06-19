package com.CH3;

public class Addition {
    public Addition(int a, int b){
        System.out.println("Addition is :: "+(a+b));
    }
    public Addition(int a, float b){
        System.out.println("Addition is :: "+(a+b));
    }
    public Addition(float a, int b){
        System.out.println("Addition is :: "+(a+b));
    }
    public Addition(double a, double b){
        System.out.println("Addition is :: "+(a+b));
    }
    public Addition(int...a){
        int sum = 0;
        for(int i : a){
            sum = sum + i;
        }
        System.out.println("Addition is :: "+sum);
    }

    public static void main(String[] args) {
        Addition a = new Addition(10,20);
        a = new Addition(10, 25.47f);
        a = new Addition(457.5f, 47);
        a = new Addition(25.587, 68.54);
        a = new Addition(45,78,69,52,78);
    }
}
