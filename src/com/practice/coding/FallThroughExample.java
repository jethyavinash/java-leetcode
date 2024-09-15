package com.practice.coding;

public class FallThroughExample {
    public static void main(String[] args) {
        int number = 2;
        
        switch (number) {
            case 1:
                System.out.println("Number is one");
                break;
            case 2:
            case 3:
                System.out.println("Number is two or three");
                // No break here, so fall through to next case
            case 4:
                System.out.println("Number is four");
                break;
            default:
                System.out.println("Number is not one, two, three, or four");
                break;
        }
    }
}