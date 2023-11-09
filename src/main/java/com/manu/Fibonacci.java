package com.manu;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacciTail(5, 0, 1));
        System.out.println(fibonacciHead(5));
    }

    static int fibonacciTail(int num, int a, int b) {
        if (num == 0) return a;
        if (num == 1) return b;
        return fibonacciTail(num - 1, b, a + b);
    }


    static int fibonacciHead(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibonacciHead(num - 1) + fibonacciHead(num - 2);
    }
}
