package com.CH1;

//Q1.
// accept two integer values via Command Line Arguments
// and perform all arithmetic operation

public class Code1 {
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        System.out.println("ADDITION IS :: "+(a+b));
        System.out.println("SUBTRACTION IS :: "+(a-b));
        System.out.println("MULTIPLICATION IS :: "+(a*b));
        System.out.println("DIVISION IS :: "+(a/b));
    }
}
