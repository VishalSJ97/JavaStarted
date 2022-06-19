package com.CH3;

import java.util.Scanner;

public class Array {
    static int size = 0;
    static Scanner sc = new Scanner(System.in);

    public static int[] arr(int size, int[] array) {
        System.out.println("Enter the array");
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void addInC(int size, int[] arr1, int[] arr2, int[] arr3) {
        System.out.println("SUM OF EACH POS ARRAY IS :: ");
        for(int i=0; i<size; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }

        for(int i : arr3) {
            System.out.println(" "+i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array :: ");
        size = sc.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        int[] c = new int[size];

        addInC(size, arr(size, a), arr(size, b), c);
    }
}
