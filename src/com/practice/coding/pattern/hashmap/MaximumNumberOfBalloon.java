package com.practice.coding.pattern.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloon {
    public static void main(String[] args) {
        String ballons = "balloonballoo";
        int maxNoOfBalloon = findMaxNumOfBallons(ballons);
        System.out.println(maxNoOfBalloon);
    }

    private static int findMaxNumOfBallons(String ballons){
        Map<Character,Integer> freqMap = new HashMap<>();
        for(Character c : ballons.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
        }
        int minNum = Integer.MAX_VALUE;
        minNum = Math.min(minNum, freqMap.get('b'));
        minNum = Math.min(minNum,freqMap.get('a'));
        minNum = Math.min(minNum,freqMap.get('l')/2);
        minNum = Math.min(minNum,freqMap.get('o')/2);
        minNum = Math.min(minNum,freqMap.get('n'));
        return minNum;
    }
}
