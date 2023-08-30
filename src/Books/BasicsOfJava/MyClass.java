package Books.BasicsOfJava;

public class MyClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("...0%");
        for (int i = 5; i < 101; i += 5) {
            Thread.sleep(1000);
            System.out.print("\r... " + i + "%");
        }
        System.out.println();
    }
}
