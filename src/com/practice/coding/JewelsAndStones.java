package com.practice.coding;

import java.util.HashSet;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "abc";
        String stones = "aabbcc";

        int count = findStoneThatAreJewel(jewels,stones);
        System.out.println(count);
    }

    private static int findStoneThatAreJewel(String jewels, String stones) {
        char[] jewelChar = jewels.toCharArray();
        HashSet<Character> jewelSet = new HashSet<>();
        for(char j : jewelChar){
            jewelSet.add(j);
        }
        int count = 0;
        for(char s: stones.toCharArray()){
            if(jewelSet.contains(s)){
                count++;
            }
        }
        return count;
    }
}
