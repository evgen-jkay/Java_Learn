package Books.JavaPhilosophy.access.reusing;

public class Bath {
    private String
    s1 = "Happy",
    s2 = "Happy",
    s3, s4;

    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
            System.out.println("In constructor Bath()");
            s3 = "Radosnii";
        toy = 3.14f;
        castille = new Soap();
    }

    { i = 47; }

    public String toString() {
        if (s4 == null)
            s4 = "Radosnii";
        return
                "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}

class Soap {
    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    public String toString() { return s; }
}
