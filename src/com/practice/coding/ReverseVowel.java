package com.practice.coding;

public class ReverseVowel {
    public static void main(String[] args) {
        String str = "hello";
        String result = reverseVowels(str);
        System.out.println(result);
    }

    private static String reverseVowels(String str) {
        String VOWELS = "aeiouAEIOU";
        char[] strChars = str.toCharArray();
        int first = 0;
        int last = strChars.length-1;

        while (first<last){
            while (first<last && VOWELS.indexOf(strChars[first]) == -1){
                first++;
            }

            while (last>first && VOWELS.indexOf(strChars[last]) == -1){
                last--;
            }

            char temp = strChars[first];
            strChars[first] = strChars[last];
            strChars[last] = temp;

            first++;
            last--;
        }

        return new String(strChars);
    }
}
