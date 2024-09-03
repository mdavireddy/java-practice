package com.manu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Base7Calculation {

    public static void main(String[] args) {
        System.out.println(calculateBase7Value(100));
        System.out.println(calculateBase7Value(7));
        System.out.println(calculateBase7Value(-7));
    }

    static String calculateBase7Value(int num) {
        if(num == 0) return "0";
        int originalNumber = num;
        num = Math.abs(num);
        List<String> remainders = new ArrayList<>();
        while(num > 0) {
            remainders.add(String.valueOf(num % 7));
            num /= 7;
        }
        if(originalNumber < 0) {
            remainders.add("-");
        }
        Collections.reverse(remainders);
        return remainders.stream().reduce( "", (a , b) -> a + b);
    }
}
