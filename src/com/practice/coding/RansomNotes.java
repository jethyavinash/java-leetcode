package com.practice.coding;

import java.util.HashMap;

public class RansomNotes {
    public static void main(String[] args) {
        String ransom = "notes";
        String magzine = "stoned";
        boolean canCreate = isRansomPossible(ransom,magzine);
        System.out.println("can create? "+canCreate);
    }

    private static boolean isRansomPossible(String ransom, String magzine) {
        boolean canCreate = true;
        HashMap<Character,Integer> magzineCount = new HashMap<>();
        for(char c : magzine.toCharArray()){
            magzineCount.put(c,magzineCount.getOrDefault(c,0)+1);
        }

        for(char r : ransom.toCharArray()){
            if(magzineCount.get(r) > 0){
                magzineCount.put(r,magzineCount.get(r) -1);
            }else {
                canCreate = false;
            }
        }
        return canCreate;
    }
}
