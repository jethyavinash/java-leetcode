package com.practice.coding.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharByFreq {
    public static void main(String[] args) {
        String input = "apple";
        String sortedByFreq = freqSorting(input);
        System.out.println(sortedByFreq);
    }

    private static String freqSorting(String input) {
        Map<Character,Integer> freqMap = new HashMap<>();
        for(char c : input.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));
        maxHeap.addAll(freqMap.entrySet());

        StringBuilder stringBuilder = new StringBuilder();
        while (!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> entry = maxHeap.poll();
            char key = entry.getKey();
            int val = entry.getValue();
            for(int i=0;i<val;i++){
                stringBuilder.append(key);
            }
        }
        return stringBuilder.toString();
    }
}
