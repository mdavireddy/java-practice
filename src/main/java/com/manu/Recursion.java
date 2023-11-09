package com.manu;

public class Recursion {
    public static void main(String[] args) {
        System.out.format("Factorial head recursion %d", factorialHead(5));
        System.out.println();
        System.out.format("Factorial tail recursion %d", factorialTail(5, 1));

    }

    static int factorialHead(int num) {
        if(num == 0 || num == 1) return 1;
        return num * factorialHead(num - 1);
    }


    static int factorialTail(int num, int accumlator) {
        if(num == 0) return accumlator;
        return factorialTail(num -1, num * accumlator);
    }
}
