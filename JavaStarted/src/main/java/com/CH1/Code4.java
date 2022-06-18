package com.CH1;

/**
 * Q4.
 *  Accept five different values via CLA* by using for loop and display sum of that values
 * */

public class Code4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int a = Integer.parseInt(args[i]);
            sum = sum + a;
        }
        System.out.println("SUM OF 5 digits is :: "+sum);
    }
}
