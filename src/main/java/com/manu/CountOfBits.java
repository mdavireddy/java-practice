package com.manu;

public class CountOfBits {

    public static void main(String[] args) {
        System.out.println(countBits(11));
        System.out.println(countBits(25));
        System.out.println(countBits(45));
    }

    private static int countBits(int num) {
        int count = 0;
        while( num > 0) {
            count ++;
            num = num & (num -1);
        }
        return count;
    }
}
