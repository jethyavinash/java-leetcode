package com.practice.coding.pattern.monotonicstack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatureNextWarmDay {
    public static void main(String[] args) {
        int[] temperatures = new int[]{70, 73, 75, 71, 69, 72, 76, 73};
        int[] daysToWarm = findDaysToWarm(temperatures);
        System.out.println(Arrays.toString(daysToWarm));
    }

    private static int[] findDaysToWarm(int[] temperatures){
        Stack<Integer> stack = new Stack<>();
        int[] daysToWarm = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prevDayTemp = stack.pop();
                daysToWarm[prevDayTemp] = i - prevDayTemp;
            }
            stack.push(i);
        }
        return daysToWarm;
    }
}
