package com.books.HeadFirstJava.example.arrays;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Jkay", 1);
        scores.put("Vika", 2);

        System.out.println(scores);
        System.out.println("---");
        System.out.println(scores.get("Vika"));
    }
}
