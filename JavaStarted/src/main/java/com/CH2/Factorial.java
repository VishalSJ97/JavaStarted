package com.CH2;

public class Factorial {
    void fact(int num) {
        int fact = 1;
        while(num != 0) {
            fact = fact * num;
            num = num - 1;
        }
        System.out.println("FACTORIAL IS :: "+fact);
    }
}
