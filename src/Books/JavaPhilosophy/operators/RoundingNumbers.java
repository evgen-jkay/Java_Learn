package Books.JavaPhilosophy.operators;

public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fAbove = 0.7f, fBelow = 0.4f;

        System.out.println("Math.round(above): " + Math.round(above));
        System.out.println("Math.round(below): " + Math.round(below));
        System.out.println("Math.round(fAbove): " + Math.round(fAbove));
        System.out.println("Math.round(fBelow): " + Math.round(fBelow));
    }
}
