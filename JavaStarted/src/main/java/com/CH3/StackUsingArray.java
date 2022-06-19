package com.CH3;

public class StackUsingArray {

    int[] a = new int[5];
    int pos = -1;

    public void push(int num) {
        pos++;
        if(pos < 5) {
            a[pos] = num;
            System.out.println("======================");
            System.out.println("push("+num+")");
            for (int i=0; i<=pos; i++) {
                System.out.println("a["+i+"] :: "+a[i]);
            }
        }
        else {
            System.out.println("======================");
            System.out.println("STACK FULL");
            pos--;
        }
    }

    public void pop() {
        if(pos <= -1) {
            System.out.println("======================");
            System.out.println("STACK EMPTY");
        } else {
            int num = a[pos];
            a[pos] = 0;
            System.out.println("======================");
            System.out.println("pop("+num+")");
            pos--;
            System.out.println("======================");
            for (int i=0; i<=pos; i++) {
                System.out.println("a["+i+"] :: "+a[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();
        s.pop();
        s.push(74);
        s.push(45);
        s.push(36);
        s.push(12);
        s.push(22);
        s.push(54);
        s.push(91);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
