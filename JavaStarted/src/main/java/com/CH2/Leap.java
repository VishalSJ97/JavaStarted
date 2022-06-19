package com.CH2;

public class Leap {
    public String leapYN(int year) {
        if(year%4 == 0 || year%100 == 0)
            return year+" :: is a LEAP YEAR";
        else
            return year+" :: is NOT A LEAP YEAR";
    }
}
