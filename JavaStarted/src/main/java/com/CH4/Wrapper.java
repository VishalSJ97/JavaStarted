package com.CH4;

import com.CH2.Fabonicci;

public class Wrapper {
    public static void main(String[] args) {
        System.out.println("MAX_VALUES\t\t\t\tMIN_VALUES");
        System.out.println("===============================================");
        System.out.println(Byte.MAX_VALUE+"\t\t\t\t\t\t"+Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE+"\t\t\t\t\t"+Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE+"\t\t\t\t"+Integer.MIN_VALUE);
        System.out.println(Float.MAX_VALUE+"\t\t\t"+ Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE+"\t"+Double.MIN_VALUE);
    }
}
