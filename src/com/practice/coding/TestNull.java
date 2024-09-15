package com.practice.coding;

import java.util.ArrayList;
import java.util.List;

public class TestNull {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(method(list));

    }

    private static List<String> method(List<String> list) {
        list = method1();
        return list;
    }

    private static List<String> method1() {
        ArrayList<String>  list = new ArrayList<>();
        list.add("a");list.add("b");list.add("c");
        return list;
    }
}
