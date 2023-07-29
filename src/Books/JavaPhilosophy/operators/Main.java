package Books.JavaPhilosophy.operators;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // зрівнення
        Dog name1 = new Dog();
        Dog name2 = new Dog();

        name1.name = "Spot";
        name2.name = "Spot";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name1.name);
        System.out.println(name2.name);
        System.out.println(name1 == name2);
        System.out.println(name1.name == name2.name);
        System.out.println(".equals(): " + name1.equals(name2));
        System.out.println(".equals(): " + name1.name.equals(name2.name));
        System.out.println("Objects.equals(): " + Objects.equals(name1, name2));
        System.out.println("Objects.equals(): " + Objects.equals(name1.name, name2.name));
    }

}

class Value {
    int i;
}