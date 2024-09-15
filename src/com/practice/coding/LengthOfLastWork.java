package com.practice.coding;

public class LengthOfLastWork {
    public static void main(String[] args) {
        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }
    public static int lengthOfLastWord(String s) {
        String[] splited = s.split(" ");
        return splited[splited.length-1].length();
    }
}
