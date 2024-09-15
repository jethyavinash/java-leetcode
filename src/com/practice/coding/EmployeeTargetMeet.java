package com.practice.coding;

import java.util.Arrays;

public class EmployeeTargetMeet {
    public static void main(String[] args) {
        int[] hours = {1,4,2,7,3,2,0};
        int target = 7;
        long noOfEmp = findNoOfEmpMeetingTarget(hours,target);
        System.out.println(noOfEmp);
    }

    private static long findNoOfEmpMeetingTarget(int[] hours, int target) {
        return (int)Arrays.stream(hours).filter(hour -> hour >= target).count();
    }
}
