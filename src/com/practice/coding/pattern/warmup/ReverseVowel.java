package com.practice.coding.pattern.warmup;

public class ReverseVowel {
    public static void main(String[] args) {
        String input = "hgbcd";
        String result = reverseVowel(input);
        System.out.println(result);
    }

    private static String reverseVowel(String input){
        String vowel = "aeiouAEIOU";
        char[] cArr = input.toCharArray();
        int first = 0;
        int last = input.length()-1;

        while (first < last){
            while (first < last && vowel.indexOf(cArr[first]) == -1){
                first++;
            }

            while (first < last && vowel.indexOf(cArr[last]) == -1){
                last--;
            }

            char temp = cArr[last];
            cArr[last] = cArr[first];
            cArr[first] = temp;
            first++;
            last--;
        }
        return new String(cArr);
    }
}
