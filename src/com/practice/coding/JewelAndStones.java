package com.practice.coding;

import java.util.HashSet;

public class JewelAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAaZz";

        int result = findStoneThatAreJewel(jewels,stones);
        System.out.println(result);
    }

    private static int findStoneThatAreJewel(String jewels, String stones) {
        int count = 0;
        for(Character c : stones.toCharArray()){
            if(jewels.indexOf(c) != -1){
                count++;
            }
        }
        return count;

    }
}
