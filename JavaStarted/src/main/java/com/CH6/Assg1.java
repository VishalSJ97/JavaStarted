package com.CH6;

import java.util.Random;

public class Assg1 {
    public static void main(String[] args) {
        Instruments[] instruments = new Instruments[10];

        Random random = new Random();

        for (int i=0; i<10; i++) {
            int randNum = random.nextInt((3-1)+1)+1;

            if(randNum == 1) {
                instruments[i] = new Piano();
            } else if (randNum == 2) {
                instruments[i] = new Guitar();
            } else {
                instruments[i] = new Flute();
            }
            instruments[i].play();
        }

        for (int i=0; i<10; i++) {
            if (instruments[i] instanceof Piano)
                System.out.println("Piano is stored at index :: "+i);
            else if (instruments[i] instanceof Guitar)
                System.out.println("Guitar is stored at index :: "+i);
            else if (instruments[i] instanceof Flute)
                System.out.println("Flute is stored at index :: "+i);
        }
    }
}
