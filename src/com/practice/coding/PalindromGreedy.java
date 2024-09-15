package com.practice.coding;

public class PalindromGreedy {
    public static void main(String[] args) {
        String s = "abcdgjhfdcba";
        boolean isPalindrome = checkIfPalindrome(s);
        System.out.println(isPalindrome);
    }

    private static boolean checkIfPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(left+1,right,s) || isPalindrome(left,right-1,s);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(int left, int right, String s) {
        while (left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
