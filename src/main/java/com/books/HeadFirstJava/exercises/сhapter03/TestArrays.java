package com.books.HeadFirstJava.exercises.сhapter03;

public class TestArrays {
    public static void main(String[] args) {
        int [] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        String [] isLands = new String[4];

        isLands[0] = "Бермуды";
        isLands[1] = "Фиджи";
        isLands[2] = "Азорские острова";
        isLands[3] = "Косумель";

        int y = 0;
        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.print("острова - ");
            System.out.println(isLands[ref]);
            y++;
        }
    }
}
