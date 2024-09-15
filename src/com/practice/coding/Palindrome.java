package com.practice.coding;

public class Palindrome {
    public static void main(String[] args) {
        int x = 112211;
        boolean result = isPalindrome2(x);
        System.out.println(result);
    }

    private static boolean isPalindrome(int num) {
        int temp = num;
        if(num < 0)
            return false;
        if(num%10 == 0)
            return false;
        int reverse = 0;
        while (num > 0){
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        if(reverse == temp)
            return true;

        return false;
    }

    public static boolean isPalindrome2(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }

        int reversed = 0;
        while (num > reversed) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return num == reversed || num == reversed / 1;
    }
}
