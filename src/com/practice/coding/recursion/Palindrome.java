package com.practice.coding.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "racecars";
        boolean isPalindrome = palindrome(s,0,s.length()-1);
        System.out.println(isPalindrome);
    }

    private static boolean palindrome(String s,int start,int end) {
        if(start >= end){
            return true;
        }

        if(s.charAt(start) != s.charAt(end))
            return false;

        return palindrome(s,start+1,end-1);
    }
}
