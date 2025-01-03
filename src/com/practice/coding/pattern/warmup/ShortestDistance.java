package com.practice.coding.pattern.warmup;

public class ShortestDistance {
    public static void main(String[] args) {
        String[] words = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy","fox", "dog" };
        String word1 = "fox";
        String word2 = "dog";

        int distance = shortedDistance(words,word1,word2);
        System.out.println(distance);
    }

    private static int shortedDistance(String[] words, String word1, String word2) {
        int shortedDistance = words.length;
        int pos1 = -1;
        int pos2 = -1;

        for(int i=0;i<words.length;i++){
            if(words[i] == word1){
                pos1 = i;
            }

            if(words[i] == word2){
                pos2 = i;
            }

            if(pos1 != -1 && pos2 != -1){
                shortedDistance = Math.min(shortedDistance,Math.abs(pos1-pos2));
            }
        }
        return shortedDistance;
    }
}
