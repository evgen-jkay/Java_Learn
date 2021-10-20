package com.books.HeadFirstJava;

import java.util.ArrayList;

public class Egg {
    public static void main(String[] args) {
        ArrayList<Egg> myList = new ArrayList<Egg>();

        Egg s = new Egg();
        myList.add(s);                      // Add Object 2

        Egg b = new Egg();
        myList.add(b);                      // Add Object 2

        int theSize = myList.size();        // 2
        boolean isIn = myList.contains(s);  // true
        int idx = myList.indexOf(b);        // return index 1
        boolean empty = myList.isEmpty();   // false

        myList.remove(s);
    }
}
