package com.CH2;

public class Voting {
    public String votingYN(int age) {
        if (age > 18 && age < 100)
            return "You are eligible for voting";
        else
            return "You are not eligible for voting";
    }
}
