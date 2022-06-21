package com.CH4;

import java.util.Scanner;

public class BinHexOct {
    Scanner sc;

    BinHexOct() {
        sc = new Scanner(System.in);
        System.out.println("Enter the number :: ");
    }

    private void convert() {
        int num = sc.nextInt();
        String bin = Integer.toBinaryString(num);
        System.out.println("BINARY NUM IS :: "+bin);
        String hex = Integer.toHexString(num);
        System.out.println("HEXADECIMAL NUM IS :: "+hex);
        String oct = Integer.toOctalString(num);
        System.out.println("OCTAL NUM IS :: "+oct);
    }

    public static void main(String[] args) {
        BinHexOct b = new BinHexOct();
        b.convert();
    }
}
