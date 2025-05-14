package com.practice.coding.pattern.orderedset;

import java.util.*;

public class MergeSimilarItems {
    public static void main(String[] args) {
        int[][] item1 = {{1,2}, {4,3}};
        int[][] item2 = {{2,1}, {4,3}, {3,4}};

        List<List<Integer>> result = mergeSimilarItems(item1,item2);
        System.out.println(result);
    }

    private static List<List<Integer>> mergeSimilarItems(int[][] item1,int[][] item2){
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();

        for(int[] arr1: item1){
            treeMap.put(arr1[0],treeMap.getOrDefault(arr1[0],0)+arr1[1]);
        }

        for(int[] arr2: item2){
            treeMap.put(arr2[0],treeMap.getOrDefault(arr2[0],0)+arr2[1]);
        }

        List<List<Integer>> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:  treeMap.entrySet()){
            result.add(Arrays.asList(entry.getKey(),entry.getValue()));
        }
        return result;
    }
}
