package Books.JavaPhilosophy.operators;

public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("Big: " + big);
        int bigger = big * 4;
        System.out.println("More big: " + bigger);
    }
}
