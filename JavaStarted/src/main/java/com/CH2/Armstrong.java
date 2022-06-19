package com.CH2;

public class Armstrong {
    String armstrongYN(int number) {
        int num = number;
        int newnum = 0;
        while(number != 0) {
            int rem = number % 10;
            newnum = newnum + rem*rem*rem;
            number = number/10;
        }
        if(newnum == num)
            return num + " :: is an ARMSTRONG number";
        else
            return num + " :: is not an armstrong number";
    }
}
