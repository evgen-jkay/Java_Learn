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

        int maxPos = 2147483647;
        printBinaryInt("max positive: ", maxPos);
        int maxNeg = -2147483648;
        printBinaryInt("max negative: ", maxNeg);
        printBinaryInt("i: ", i);
        printBinaryInt("~i: ", ~i);
        printBinaryInt("-i: ", -i);
        printBinaryInt("j: ", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);
        printBinaryInt("i ^ j", i ^ j);
        printBinaryInt("i << 5 ", i << 5);
        printBinaryInt("i » 5", i >> 5);
        printBinaryInt("(~i) >> 5", (~i) >> 5);
        printBinaryInt("i >>> 5", i >>> 5);
        printBinaryInt("(~i) >>> 5", (~i) >>> 5);

        long l = rand.nextLong();
        long m = rand.nextLong();
        printBinaryLong("-1L", -1L);
        printBinaryLong("+1L", +1L);
        long ll = 9223372036854775807L;
        printBinaryLong("MaKC. положит.", ll);
        long lln = -9223372036854775808L;
        printBinaryLong("MaKC. отрицат.", lln);
        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong( "m", m);
        printBinaryLong( "l & m", l & m);
        printBinaryLong( "l | m", l | m);
        printBinaryLong( "l ^ m", l ^ m);
        printBinaryLong( "l << 5", l << 5);
        printBinaryLong( "l >> 5", l >> 5);
        printBinaryLong( "(~l ) >> 5", (~l) >> 5);
        printBinaryLong( "l >>> 5" , l >>> 5);
        printBinaryLong("(~l) > » 5", (~l) >>> 5);
    }
}
