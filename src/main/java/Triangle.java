public class Triangle {

    private int a;

    private int b;

    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isItTriangle() {
        return ((a + b > c) & (b + c > a) & (a + c > b) & (a > 0) & (b > 0) & (c > 0));
    }

    public boolean isItDegenerateTriangle() {
        return (((a + b == c) | (b + c == a) | (a + c == b)) & (a > 0) & (b > 0) & (c > 0));
    }
}
