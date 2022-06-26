package com.CH6;

import java.util.Random;

abstract class Medicine {
    public abstract void displayLabel();
}

class Tablet extends Medicine {
    Tablet() {
        System.out.println("TABLET CLASS");
    }
    @Override
    public void displayLabel() {
        String name = "G.A. Williams";
        String address = "Los Angles";
        System.out.println("NAME :: "+ name +" :: ADDRESS :: "+ address);
    }
}

class Syrup extends Medicine {
    Syrup() {
        System.out.println("SYRUP CLASS");
    }
    @Override
    public void displayLabel() {
        String name = "J.A. Leo";
        String address = "New York";
        System.out.println("NAME :: "+ name +" :: ADDRESS :: "+ address);
    }
}

class Ointment extends Medicine {
    Ointment() {
        System.out.println("OINTMENT CLASS");
    }
    @Override
    public void displayLabel() {
        String name = "L.S. Jane";
        String address = "Singapore";
        System.out.println("NAME :: "+ name +" :: ADDRESS :: "+ address);
    }
}

public class Assg2 {
    public static void main(String[] args) {
        Medicine[] medicines = new Medicine[10];

        Random random = new Random();

        for(int i=0; i<10; i++) {
            int randNum = random.nextInt((3-1)+1)+1;

            if(randNum == 1) {
                medicines[i] = new Syrup();
            } else if (randNum == 2) {
                medicines[i] = new Tablet();
            } else {
                medicines[i] = new Ointment();
            }
            medicines[i].displayLabel();
        }
    }
}
