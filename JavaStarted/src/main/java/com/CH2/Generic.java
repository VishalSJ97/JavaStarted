package com.CH2;

import java.util.Scanner;

public class Generic {
    static Scanner sc = new Scanner(System.in);
    static int num = 0;

    public static void main(String[] args) {
        System.out.println("Enter age for VOTING :: ");
        num = sc.nextInt();
        Voting v = new Voting();
        System.out.println(v.votingYN(num));

        System.out.println("Enter the year to check LEAP or NOT :: ");
        num = sc.nextInt();
        Leap l = new Leap();
        System.out.println(l.leapYN(num));

        System.out.println("Enter Number for Factorial :: ");
        num = sc.nextInt();
        Factorial f = new Factorial();
        f.fact(num);

        System.out.println("Check num ARMSTRONG or NOT :: ");
        num = sc.nextInt();
        Armstrong a = new Armstrong();
        System.out.println(a.armstrongYN(num));//153 is and armstrong number

        System.out.println("Enter number to reverse :: ");
        num = sc.nextInt();
        ReverseNum r = new ReverseNum();
        System.out.println(r.reverseNumber(num));

        System.out.println("How many numbers do U need fabSeries :: ");
        int num = sc.nextInt();
        Fabonicci fs = new Fabonicci();
        fs.fabSerie(num);
    }
}
