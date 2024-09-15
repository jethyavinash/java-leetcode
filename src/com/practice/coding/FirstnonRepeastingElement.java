package com.practice.coding;

import java.util.HashMap;

public class FirstnonRepeastingElement {
    public static void main(String[] args) {
        String word = "aapple";
        Character result = findWord(word);
        System.out.println(result);
    }

    private static Character findWord(String word) {
        Character result = null;
        HashMap<Character,Integer> container = new HashMap<>();
        for(int i = 0 ; i < word.length();i++){
            char c = word.charAt(i);
            container.put(c,container.get(c) == null ? 1 : container.get(c)+1);
        }
        result = container.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
        return result;
    }
}
