package Books.JavaPhilosophy.exercises._5_chapter;

public class Exercises {
    public static void main(String[] args) {
        Example example = new Example();
        Example example1 = new Example("Hello");

        Dog dog1 = new Dog();

        NoConstructor noConstructor = new NoConstructor();

        dog1.bark();
        dog1.bark(2);
        dog1.bark(2.5);
        dog1.bark("dog");
    }
}

class Example {
    Example() {}

    Example(String s) {
        System.out.println(s);
    }
}

class Dog {
    void bark() {
        System.out.println("null");
    }

    void bark(int i) {
        System.out.println(i + " int");
    }

    void bark(double d) {
        System.out.println(d + " double");
    }

    void bark(String s) {
        System.out.println( s + " string");
    }
}

class NoConstructor{}