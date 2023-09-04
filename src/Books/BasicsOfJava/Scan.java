package Books.BasicsOfJava;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        System.out.println("Введите целое число:");
        x = in.nextInt();
        if (x % 2 == 0)
            System.out.println(x + " - четное");
        else
            System.out.println(x + " - нечетное");
        System.out.println();
    }
}
