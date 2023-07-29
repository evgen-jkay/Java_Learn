package Books.JavaPhilosophy.control;

public class IfElse {

    static int result = 0;
    static void test(int tastval, int target) {
     if (tastval > target)
         result = +1;
     else if (tastval < target)
         result = -1;
     else
         result = 0;
    }
}
