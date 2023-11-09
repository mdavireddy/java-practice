package com.manu;

public class GCDProblem {

    public static void main(String[] args) {
        System.out.println(gcd(10,3));
    }

    static int gcd(int num, int divisor) {
        if(num % divisor == 0) return divisor;

        return gcd(divisor, num % divisor);
    }
}
