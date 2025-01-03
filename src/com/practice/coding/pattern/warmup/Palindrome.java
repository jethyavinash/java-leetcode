package com.practice.coding.pattern.warmup;

public class Palindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama!";
        boolean isPalindrome = isPalindrome(input);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrome(String input){
        int i = 0;int j = input.length()-1;
        while (i < j){
            while (i<j && !Character.isLetterOrDigit(input.charAt(i))){
                i++;
            }

            while (i<j && !Character.isLetterOrDigit(input.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
