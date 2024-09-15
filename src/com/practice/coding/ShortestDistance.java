package com.practice.coding;

public class ShortestDistance {


    public static void main(String[] args) {
        String[] words = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
        String word1 = "fox";
        String word2 = "brown";
        int result = shortestDistance(words, word1, word2);
        System.out.println(result);
    }

    private static int shortestDistance(String[] words, String word1, String word2) {
        int position1 = -1;
        int position2 = -1;
        int shortestDistance = words.length;
        for(int i = 0;i < words.length;i++){
            if(words[i].equals(word1)){
                position1 = i;
            }
            if(words[i].equals(word2)){
                position2 = i;
            }

            if(position1 != -1 && position2 != -1){
                shortestDistance = Math.min(shortestDistance,Math.abs(position2-position1));
            }
        }
        return shortestDistance;
    }
}
