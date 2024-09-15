package com.practice.coding;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {


        int result = romanToInteger("MMMCDXLIV");
        System.out.println("result: "+result);

    }

    private static int romanToInteger(String input) {
        int result = 0;
        Map<Character,Integer> romanDictionary = new HashMap<>();
        romanDictionary.put('I',1);
        romanDictionary.put('V',5);
        romanDictionary.put('X',10);
        romanDictionary.put('L',50);
        romanDictionary.put('C',100);
        romanDictionary.put('D',500);
        romanDictionary.put('M',1000);

        for(int i = 0;i<input.length();i++){
            if(i < input.length()-1 && romanDictionary.get(input.charAt(i)) <  romanDictionary.get(input.charAt(i+1))){
               result = result - romanDictionary.get(input.charAt(i));
            }else{
                result = result + romanDictionary.get(input.charAt(i));
            }
        }
        return result;
    }
}
