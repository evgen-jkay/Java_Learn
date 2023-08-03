package Books.JavaPhilosophy.initialization;

public class MethodInit2 {
    int i = f();
    int f = g(i);
    int f() { return 11; }
    int g(int n) { return n * 10; }
}
