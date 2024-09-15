package com.practice.coding;

public class RemoveAdjDuplicate {
    public static void main(String[] args) {
        String input = "foobar";
        String result = removeAdjDupe(input);
        System.out.println("result:: "+result);
    }

    private static String removeAdjDupe(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = input.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(stringBuilder.length() > 0 && chars[i] == stringBuilder.charAt(stringBuilder.length()-1)){
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
