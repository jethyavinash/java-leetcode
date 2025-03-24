package com.practice.coding.pattern.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateSubsets {
    public static void main(String[] args) {
        int[] arr = {1,3,3};
        List<List<Integer>> result = findDistinct(arr);
        System.out.println(result);
    }

    private static List<List<Integer>> findDistinct(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        int startIndex = 0;
        int endIndex = 0;

        for(int i = 0;i < arr.length ; i++){
            startIndex = (i>0 && arr[i] == arr[i-1]) ? endIndex : 0;
            endIndex = result.size();

            for(int j = startIndex;j < endIndex;j++){
                ArrayList<Integer> newSubset = new ArrayList<>(result.get(j));
                newSubset.add(arr[i]);
                result.add(newSubset);
            }
        }
        return result;
    }
}
