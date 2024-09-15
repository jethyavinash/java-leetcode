package com.practice.coding;

import java.util.HashMap;
import java.util.Map;

public class MaxBaloon {
    public static void main(String[] args) {
        String input = "balloonballoooon";
        int result = maxWord(input);
        System.out.println("result: "+result);
    }

    private static int maxWord(String input) {

        Map<Character,Integer> countMap = new HashMap<>();
        for(int i = 0;i<input.toCharArray().length;i++){
            Integer count = countMap.get(input.charAt(i));
            if(count == null){
                countMap.put(input.charAt(i),1);
            }else {
                countMap.put(input.charAt(i),count+1);
            }
        }
        return countMap.values().stream().min(Integer::compareTo).get();
    }
}
