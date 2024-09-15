package com.practice.coding;

import java.util.*;

public class MergeInterval {
    public static void main(String[] args) {
        List<Interval> inputIntervals = new ArrayList<>();
        inputIntervals.add(new Interval(1, 4));
        inputIntervals.add(new Interval(2, 5));
        inputIntervals.add(new Interval(7, 9));

        List<Interval> resultInterval = mergeInterval(inputIntervals);
        for(Interval interval : resultInterval){
            System.out.println("["+interval.getStart() + "," +interval.getEnd()+"]");
            System.out.println();
        }
    }

    private static List<Interval> mergeInterval(List<Interval> inputIntervals) {
        if(inputIntervals.size() < 2){
            return inputIntervals;
        }

        List<Interval> mergedInterval = new ArrayList<>();
        Collections.sort(inputIntervals, (a,b) -> Integer.compare(a.getStart(), b.getStart()));

        Iterator<Interval> iterator = inputIntervals.iterator();
        Interval interval = iterator.next();
        int start = interval.getStart();
        int end = interval.getEnd();

        while (iterator.hasNext()) {
            Interval nextInterval = iterator.next();
            if(nextInterval.getStart()<end){
                end = Math.max(end, nextInterval.getEnd());
            }else {
                mergedInterval.add(new Interval(start,end));
                start = nextInterval.getStart();
                end = nextInterval.getEnd();
            }
        }
        mergedInterval.add(new Interval(start,end));
        return mergedInterval;
    }
}

class Interval {
    int start;
    int end;
    public Interval(int start,int end){
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
