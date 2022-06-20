package com.CH4;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Vishal Jadhav";
        String newname = "Vishal Jadhav";
        String str = "Hello ";

        System.out.println(name.length());
        System.out.println(name.hashCode());
        System.out.println(name.equals(newname));
        System.out.println(name.replace("Vishal", "Jagdish"));
        System.out.println(name.trim());
        System.out.println(name.substring(0, 6));
        System.out.println(str.concat(",World"));
        System.out.println(name.compareTo(newname));
        System.out.println(str.charAt(0));
    }
}
