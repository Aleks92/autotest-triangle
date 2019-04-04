public class Triangle {

    public boolean isTriangle(int a, int b, int c) {
        return ((a + b >= c) & (b + c >= a) & (a + c >= b) & (a > 0) & (b > 0) & (c > 0));
    }
}
