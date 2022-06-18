package com.CH1;

/**
 * Q6.
 *   Accept values via CLA*  for 1-D array of integer type and display it on screen
 * */

public class Code6 {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int[] a = new int[size];
        for(int i=1; i<=size; i++)
            a[i-1] = Integer.parseInt(args[i]);
        for(int i=1; i<=size; i++)
            System.out.print(a[i-1]+" ");
    }
}
