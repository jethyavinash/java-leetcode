package com.practice.coding;

import java.util.HashMap;
import java.util.Map;

public class MaxBalloons {
    public static void main(String[] args) {
        int result = maxBalloons("balloonballoon");
        System.out.println(result);
    }

    private static int maxBalloons(String str) {
        Map<Character,Integer> freq = new HashMap<>();
        for(Character c : str.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        int min = Integer.MAX_VALUE;
        min = Math.min(min,freq.get('b'));
        min = Math.min(min,freq.get('a'));
        min = Math.min(min,freq.get('l') / 2);
        min = Math.min(min,freq.get('o') / 2);
        min = Math.min(min,freq.get('n'));

        return min;
    }
}
