package com.practice.coding.recursion;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        String rev = reverse(s);
        System.out.println(rev);
    }

    public static String reverse(String s){
        if(s == null || s.length() == 1){
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }
}
