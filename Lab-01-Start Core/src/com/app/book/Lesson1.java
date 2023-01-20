package com.app.book;

/**
 * Data types
 * byte - 1 byte - Stores whole numbers from -128 to 127
 * short - 2 byte - Stores whole numbers from -32,768 to 32,767
 * int - 4 byte - Stores whole numbers from -2,147,483,648 to 2,147,483,647
 * long - 8 byte - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 * float - 4 bytes - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
 * double - 8 bytes - Stores fractional numbers. Sufficient for storing 15 decimal digits
 * boolean - 1 bit - Stores true or false values
 * char - 2 bytes - Stores a single character/letter or ASCII values
 * */

public class Lesson1 {
    public static void main(String[] args) {
        boolean bool = true;
        char ch = 'A';
        byte byt = 100;
        short shrt = 10000;
        int it = 987654321;
        long lng = 987654326789L;
        float flt = 23.456756f;
        double dble = 876.3456521;

        System.out.println(bool);
        System.out.println(ch);
        System.out.println(byt);
        System.out.println(shrt);
        System.out.println(it);
        System.out.println(lng);
        System.out.println(flt);
        System.out.println(dble);
    }
}
