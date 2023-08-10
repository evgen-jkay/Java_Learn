package Books.JavaPhilosophy.access;

public class IceCream {
    public static void main(String[] args) {
        Sundae x = Sundae.makeSundae();
    }
}

class Sundae {
    private Sundae() {
        System.out.println("Sundae");
    }

    static Sundae makeSundae() {
        return new Sundae();
    }
}
