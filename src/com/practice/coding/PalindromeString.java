package com.practice.coding;

public class PalindromeString {
    public static void main(String[] args) {

        String str = "A man, a plan, a canal, Panama!";
        boolean result = isPalindrome(str);
        System.out.println(result);
    }

    private static boolean isPalindrome(String str) {
        if(str.isEmpty())
            return false;
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                return false;
            }
            i++;j--;
        }
        return true;

    }

    public static boolean isPalindrome2(String s) {
        int i = 0, j = s.length() - 1; // initialize two pointers, one at the start and one at the end of the string
        while (i < j) { // continue until the two pointers cross over
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) { // move i forward until a letter or digit is found
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) { // move j backward until a letter or digit is found
                j--;
            }

            // compare the characters at i and j after converting them to lowercase
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false; // if they are not equal, the string is not a palindrome
            i++; // move i forward
            j--; // move j backwards
        }

        return true; // if the two pointers have crossed over, the string is a palindrome
    }
}
