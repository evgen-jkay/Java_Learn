package Books.JavaPhilosophy.initialization;

public class NoSynthesis {
    public static void main(String[] args) {
        // Birt2 birt1 = new Birt2(); // немає конструктора за замовченням
        Birt2 birt2 = new Birt2(1);
        Birt2 birt3 = new Birt2(1.0);
    }
}

class Birt2 {
    Birt2(int i) {}
    Birt2(double d) {}
}
