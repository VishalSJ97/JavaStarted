package com.CH6;

abstract class Animal {
    Animal() {
        System.out.println("Animal is a SUPER CLASS");
    }
    public abstract void sound();
}

abstract class Herbivores extends Animal {
    Herbivores() {
        System.out.println("HERBIVORES animals depends on plants for food like");
    }
}

abstract class Carnivores extends Animal {
    Carnivores() {
        System.out.println("CARNIVORES animals depends on other animals for food like");
    }
}

class Cow extends Herbivores {
    Cow() {
        System.out.println("Cow is herbivores");
    }
    @Override
    public void sound() {
        System.out.println("COW MOOS");
    }
}

class Tiger extends Carnivores {
    Tiger() {
        System.out.println("Tiger is carnivores");
    }
    @Override
    public void sound() {
        System.out.println("TIGER ROARS");
    }

}

public class Demo {
    public static void main(String[] args) {
        Animal a;

        a = new Cow();
        a.sound();

        a = new Tiger();
        a.sound();
    }
}
