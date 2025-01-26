package com.practice.coding.pattern.mergeinterval;

import java.util.*;

public class MutualExclusiveIntervals {
    public static void main(String[] args) {
        int[][] arr = {{6,7},{2,4},{5,9}};
        int[][] result = mutualExclusiveInterval(arr);
        for(int[] rs : result){
            System.out.println(Arrays.toString(rs));
        }
    }

    private static int[][] mutualExclusiveInterval(int[][] arr){
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));

        int[] currentInterval = arr[0];
        merged.add(currentInterval);

        for(int[] interval : arr){
            int currStart = currentInterval[0];
            int currEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(nextStart <= currEnd){
                currentInterval[1] = Math.max(currEnd,nextEnd);
            }else {
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][2]);
    }
}
