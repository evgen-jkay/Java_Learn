package Books.JavaPhilosophy.exercises._5_chapter;

public class Exercises16 {
    public static void main(String[] args) {
        String[] strings = new String[5];

        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = "Java";
        strings[3] = "it`s";
        strings[4] = "cool";

        for (String s : strings) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (int i = 0; i < strings.length; i++) {
            System.out.println("element " + i + ": " + strings[i] + " ");
        }
    }
}
