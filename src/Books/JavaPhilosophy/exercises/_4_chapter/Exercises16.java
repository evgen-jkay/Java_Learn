package Books.JavaPhilosophy.exercises._4_chapter;

import java.util.Random;

public class Exercises16 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] randomNumbers = new int[25];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt(100);
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            int otherIndex = rand.nextInt(randomNumbers.length);
            int otherNumber = randomNumbers[otherIndex];

            if (randomNumbers[i] < otherNumber) {
                System.out.printf("%d меньше %d%n", randomNumbers[i], otherNumber);
            } else if (randomNumbers[i] > otherNumber) {
                System.out.printf("%d больше %d%n", randomNumbers[i], otherNumber);
            } else {
                System.out.printf("%d равно %d%n", randomNumbers[i], otherNumber);
            }
        }
    }
}
