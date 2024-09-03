package com.manu;

import java.util.HashMap;
import java.util.Map;

public class NonRepetitiveElement {

    public static void main(String[] args) {
        int data[] = {
                1, 2, 3, 2, 3, 4, 1, 4, 0, 0
        };
        System.out.println(findNonRepetitiveElement(data));
        System.out.println(findNonRepetitiveElementUsingXOR(data));
    }

    private static String findNonRepetitiveElement(int[] data) {
        Map<String, Integer> countMap = new HashMap<>();

        for (int num : data) {
            countMap.put(String.valueOf(num), countMap.getOrDefault(String.valueOf(num), 0) + 1);
        }

        for (String key : countMap.keySet()) {
            if (countMap.get(key) == 1) {
                return key;
            }
        }
        return "Not found";
    }


    private static int findNonRepetitiveElementUsingXOR(int[] data) {
        int unique = 0;
        for (int num : data) {
            unique ^= num;
        }
        return unique;
    }

}

