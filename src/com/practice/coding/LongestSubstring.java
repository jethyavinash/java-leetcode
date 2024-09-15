package com.practice.coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abcdaef";
        int result = findMaxLength(input);
        System.out.println("result: "+result);
    }

    private static int findNonRepeatLongestSubstring(String input) {
        int i = 0;
        List<String> listOfStrings = new ArrayList<>();
        StringBuffer str = new StringBuffer();
        HashSet<Character> charSet = new HashSet<>();
        while (i < input.length()){
            char charAt = input.toCharArray()[i];
            boolean isDupe = charSet.add(charAt);
            if(!isDupe){
                listOfStrings.add(str.toString());
                str = new StringBuffer();
                str.append(String.valueOf(charAt));
                charSet.clear();
            }else{
                str.append(String.valueOf(charAt));
            }
            i++;
        }
        return listOfStrings.stream().max((s1,s2) -> s1.length() - s2.length()).get().length();
    }

    private static int findMaxLength(String input){
        int maxLen = 0;
        int start = 0;
        int end = 0;
        HashSet<Character> charSet = new HashSet<>();
        while (end<input.length()){
            if(charSet.contains(input.charAt(end))){
                charSet.remove(input.charAt(start));
                start++;
            }else{
                charSet.add(input.charAt(end));
                maxLen = Math.max(maxLen,end-start+1);
                end++;
            }
        }
        return maxLen;
    }
}
