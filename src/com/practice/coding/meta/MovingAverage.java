package com.practice.coding.meta;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    private Queue<Integer> queue;
    private int maxSize;
    private double sum;

    public MovingAverage(int maxSize){
        this.queue = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public double next(int val){
        queue.add(val);
        sum+=val;

        if(queue.size() > maxSize){
            sum-=queue.poll();
        }
        return sum/queue.size();
    }

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(2);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
    }
}
