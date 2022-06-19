package com.CH2;

public class ReverseNum {
    String reverseNumber(int num) {
        int oldnum = num;
        int newnum = 0;
        while(num != 0){
            int rem = num % 10;
            newnum = rem + (newnum * 10);
            num = num / 10;
        }
        return "reverse of :: "+oldnum+" is :: "+newnum;
    }
}
