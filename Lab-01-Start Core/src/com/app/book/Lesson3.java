package com.app.book;

/**
 * String is and array of characters
 * and array can be on any data types
 * there are other derived data types like objects
 * or array of objects,etc
 * */

public class Lesson3 {
    public static void main(String[] args) {
        String name = "vishal";
        int[] a = {10, 20, 50, 34, 67, 25};

        System.out.println("name :: "+name);
        for (int it: a) {
            System.out.println(it);
        }
    }
}
