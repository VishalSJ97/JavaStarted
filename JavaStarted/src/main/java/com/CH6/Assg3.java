package com.CH6;

import java.util.Random;
import java.util.Scanner;

abstract class Shape {
    private static final double PI = 3.142;
    abstract double shapeArea(Scanner sc, double PI);
}

class Circle extends Shape {
    @Override
    double shapeArea(Scanner sc, double PI) {
        System.out.println("Enter the radius :: ");
        int radius = sc.nextInt();
        return PI * radius * radius;
    }
}

class Cylinder extends Shape {
    @Override
    double shapeArea(Scanner sc, double PI) {
        System.out.println("Enter the radius of cylinder :: ");
        int radius = sc.nextInt();
        System.out.println("Enter the height of cylinder :: ");
        int height = sc.nextInt();

        return (2*PI*radius*height)+(2*PI*radius*radius);
    }
}

class Square extends Shape {
    @Override
    double shapeArea(Scanner sc, double PI) {
        System.out.println("Enter the side of Square :: ");
        int side = sc.nextInt();
        return side*side;
    }
}

class Rectangle extends Shape {

    @Override
    double shapeArea(Scanner sc, double PI) {
        System.out.println("Enter the length and breadth of Rectangle :: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        return length * breadth;
    }
}

public class Assg3 {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        double pi=3.142;
        Shape[] shape = new Shape[5];

        Random random = new Random();

        for(int i=0; i<10; i++) {
            int randNum = random.nextInt((4-1)+1)+1;

            if(randNum == 1) {
                shape[i] = new Circle();
            } else if (randNum == 2) {
                shape[i] = new Cylinder();
            } else if (randNum == 3) {
                shape[i] = new Square();
            } else {
                shape[i] = new Rectangle();
            }
            System.out.println(shape[i].shapeArea(sc, pi));
        }
    }
}
