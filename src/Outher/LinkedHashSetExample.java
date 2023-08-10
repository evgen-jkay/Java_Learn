package Outher;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add elements
        set.add("Java");
        set.add("Python");
        set.add("JS");
        set.add("TypeScript");
        set.add("Java"); // no add copy

        System.out.println("LinkedHashSet -> " + set);

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println(set.stream().findFirst());

        System.out.println(set.size());
    }
}
