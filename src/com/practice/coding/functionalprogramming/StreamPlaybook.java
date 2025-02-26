package com.practice.coding.functionalprogramming;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPlaybook {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Avinash","Ankit","Niharika","Ayush","Kiran");
        List<String> nameStartsWithA = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        names.forEach(name -> System.out.println("name1 : "+name));
        names.stream().forEach(name -> System.out.println("name2: "+name));
        System.out.println(nameStartsWithA);

        List<Integer> listOfInts = Arrays.asList(1,2,3,5,4);
        int sum = listOfInts.stream().reduce((a,b) -> a+b).get();
        System.out.println("sum: "+sum);
        List<Integer> squareAndSoted = listOfInts.stream().map(num -> num*num).sorted().collect(Collectors.toList());
        System.out.println(squareAndSoted);
        String word = "Hello world";
        long numOfL = word.chars().filter(c -> c == 'l').count();
        System.out.println("num of l: "+numOfL);

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        System.out.println(nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList()));
        System.out.println(nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(NoSuchElementException::new));

        List<Integer> listOfInts1 = Arrays.asList(1,2,3,5,4,4);
        Set<Integer> set = new HashSet<>();
        List<Integer> dupe = listOfInts1.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
        System.out.println("dupe: "+dupe);

    }
}
