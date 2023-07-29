package Books.JavaPhilosophy.operators;

import java.util.Random;

public class BitManipulation {

    static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int: " + i + ",двоїчне  \n " + Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, Long l) {
        System.out.println(s + ", long: " + l + ",двоїчне  \n " + Long.toBinaryString(l));
    }

    public static void main(String[] args) {
        Random rand = new Random(47);

        int i = rand.nextInt();
        int j = rand.nextInt();

        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
    }
}
