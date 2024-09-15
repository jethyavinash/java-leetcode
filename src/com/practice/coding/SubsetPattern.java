package com.practice.coding;

import java.util.LinkedList;
import java.util.LinkedList;

public class SubsetPattern {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5};
        LinkedList<LinkedList<Integer>> result = createSubsets(arr);
        System.out.println("result is : "+result.toString());
    }

    private static LinkedList<LinkedList<Integer>> createSubsets(int[] arr) {
        LinkedList<LinkedList<Integer>> subsets = new LinkedList<>();
        LinkedList<Integer> emptyLinkedList = new LinkedList<>();
        subsets.add(emptyLinkedList);
        int startIndex = 0;
        int endIndex = 0;
        for(int i=0;i<arr.length;i++){
            startIndex = 0;
            if(i>0 && arr[i] == arr[i-1]){
                startIndex = endIndex+1;
            }
            endIndex = subsets.size() - 1;

            for(int j = startIndex ; j <= endIndex ; j++){
                LinkedList<Integer> newLinkedList = new LinkedList<>(subsets.get(i));
                newLinkedList.add(arr[i]);
                subsets.add(newLinkedList);
            }
        }
        return subsets;
    }
}
