package com.CH4;

public class DigitOrChar {
    public static void main(String[] args) {
        String str = "14abc8f55hre";
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))) {
                String a = String.valueOf(str.charAt(i));
                int num = Integer.parseInt(a);
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }
}
