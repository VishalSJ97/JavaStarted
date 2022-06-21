package com.CH5;

class Game {
    Game() {
        System.out.println("This is Game Class");
    }
}

class Chess extends Game {
    Chess() {
        System.out.println("This is Chess Class");
    }

    public void play() {
        System.out.println("Playing Chess is fun");
    }
}

public class GameDemo {
    public static void main(String[] args) {
        Chess ch = new Chess();
        ch.play();
    }
}
