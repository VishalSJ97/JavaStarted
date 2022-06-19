package com.broken;

import com.CH3.Singleton;

class Singlton {
    private static Singlton S = new Singlton();

    private Singlton() {

    }

    public static Singlton getS(){
        return S;
    }
}

public class SingSample {
}
