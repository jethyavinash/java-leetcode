package com.practice.coding;

public class LongestNiceSubstring {
    public static void main(String[] args) {
        String s = "XxYyZzR";
        String longest = longestNiceString(s);
        System.out.println("longest nice substring is: "+longest);
    }

    private static String longestNiceString(String input) {
        if(input == null || input.length() < 1){
            return "";
        }

        if(isNice(input)){
            return input;
        }
        String longest = "";
        for (int i =0; i< input.length();i++){
            String left = input.substring(0,i);
            String right = input.substring(i+1);

            String longestLeft = longestNiceString(left);
            String longestRight = longestNiceString(right);



            if(longestLeft.length() > longestRight.length()){
                longest = longestLeft;
            }else {
                longest = longestRight;
            }
        }
        return longest;
    }

    private static boolean isNice(String input) {
        int[] charMap = new int[128];
        for(char c : input.toCharArray()){
            charMap[c] = charMap[c] + 1;
        }

        for(char c: input.toCharArray()){
            if((Character.isUpperCase(c) && charMap[Character.toLowerCase(c)] == 0)
            || (Character.isLowerCase(c) && charMap[Character.toUpperCase(c)] == 0)){
                return false;
            }
        }
        return true;
    }
}
