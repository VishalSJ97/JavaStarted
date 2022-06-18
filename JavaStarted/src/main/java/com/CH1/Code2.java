package com.CH1;

//Q2.
// Modify Code1 program try it with different  data types.

public class Code2 {
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("ADDITION IS :: "+(a+b));
        System.out.println("SUBTRACTION IS :: "+(a-b));
        System.out.println("MULTIPLICATION IS :: "+(a*b));
        System.out.println("DIVISION IS :: "+(a/b));
    }
}
