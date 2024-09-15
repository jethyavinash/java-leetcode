package com.practice.coding;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String a = null;
        System.out.println(Objects.toString(a));
        System.out.println(a.isEmpty());
    }
}
