package com.CH3;

class SingletonDeclare {
    private static SingletonDeclare singleInstance = null;

    public String s;

    private SingletonDeclare () {
        s = "Hello, I am U R Friend";
    }

    public static SingletonDeclare getInstance() {
        if(singleInstance == null) {
            singleInstance = new SingletonDeclare();
        }
        return singleInstance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        SingletonDeclare x = SingletonDeclare.getInstance();
        SingletonDeclare y = SingletonDeclare.getInstance();
        SingletonDeclare z = SingletonDeclare.getInstance();

        System.out.println("Hash Code of x is :: "+x.hashCode());
        System.out.println("Hash Code of y is :: "+y.hashCode());
        System.out.println("Hash Code of z is :: "+z.hashCode());
    }
}
