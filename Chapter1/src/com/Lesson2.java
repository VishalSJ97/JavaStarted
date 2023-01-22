package com;

/**
 * Converting one data type to another
 * Widening Casting (automatically) - converting a smaller type to a larger type size
 * byte -> short -> char -> int -> long -> float -> double
 *
 * Narrowing Casting (manually) - converting a larger type to a smaller size type
 * double -> float -> long -> int -> char -> short -> byte
 * */

public class Lesson2 {
    public static void main(String[] args) {
        //Widening
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //narrowing
        myDouble = 9.78d;
        myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}

