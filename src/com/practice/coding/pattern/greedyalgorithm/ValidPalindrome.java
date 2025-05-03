package com.practice.coding.pattern.greedyalgorithm;

public class ValidPalindrome {
    public static void main(String[] args) {
        String word = "pabeccdeba";
        boolean isValidPalindrome = isValidPalindrome(word);
        System.out.println(isValidPalindrome);
    }

    private static boolean isValidPalindrome(String word){
        int left = 0,right = word.length() -1;
        while (left < right){
            if(word.charAt(left) != word.charAt(right)){
                return isPalindrome(left+1,right,word) || isPalindrome(left,right-1,word);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(int left,int right,String word){
        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
