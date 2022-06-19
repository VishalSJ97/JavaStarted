package com.CH3;

public class Accounts {
    String name;
    long accNum;
    double balance;

    public Accounts() {
    }

    public Accounts(String name, long accNum, double balance) {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
    }

    private void deposit(int amount) {
        balance = balance + amount;
        System.out.println("U R CURRENT BALANCE IS :: "+balance);
    }

    private void withdraw(int amount) {
        if((balance - amount) < 500) {
            System.out.println("CANNOT WITHDRAW");
            System.out.println("There must be at least 500 rs left in account");
        } else {
            balance = balance - amount;
            System.out.println("U R CURRENT BALANCE IS :: "+balance);
        }
    }

    @Override
    public String toString() {
        return "Accounts :: [" +
                "name :: '" + name + '\'' +
                ", accNum :: " + accNum +
                ", balance :: " + balance +
                ']';
    }

    public static void main(String[] args) {
        Accounts a = new Accounts("Vishal Jadhav", 7584269845L, 21000);
        System.out.println(a);

        a.deposit(34060);
        System.out.println(a);

        a.withdraw(5000);
        System.out.println(a);
    }
}
