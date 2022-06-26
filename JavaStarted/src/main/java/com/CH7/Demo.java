package com.CH7;

interface printable {
    public void printLine();
    public void printStar();
}

interface testable {
    public void testCoke();
}

public class Demo implements printable,testable{
    @Override
    public void printLine() {
        System.out.println("------------------------------------");
    }
    @Override
    public void printStar() {
        System.out.println("====================================");
    }
    @Override
    public void testCoke() {
        System.out.println("Testing...please wait");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.printLine();
        d.testCoke();
        d.printStar();
    }
}
