package Books.JavaPhilosophy.control;

public class IfElse {

    static int result = 0;
    static void test(int tastval, int target) {
     if (tastval > target)
         result = 1;
     else if (tastval < target)
         result = -1;
     else
         result = 0;
    }

    public static void main(String[] args) {
        test(10, 5);
        System.out.println(result);
        test(5, 10);
        System.out.println(result);
        test(5, 5);
        System.out.println(result);
    }
}
