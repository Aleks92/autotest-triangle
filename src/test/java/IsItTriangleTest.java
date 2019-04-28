import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class IsItTriangleTest {
    @Parameterized.Parameter
    public int a;
    @Parameterized.Parameter(1)
    public int b;
    @Parameterized.Parameter(2)
    public int c;
    @Parameterized.Parameter(3)
    public boolean expected;

    @Parameterized.Parameters(name = "a= {0} b={1} c={2} : expected {3}")
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                        {5, 2, 6, true},
                        {1, 1, 2, false},
                        {1, 2, 4, false},
                        {0, 0, 0, false},
                        {-2, -3, -4, false},
                        {12501, 24129, 18945, true},
                        {(int) (0.3 * Integer.MAX_VALUE), (int) (0.4 * Integer.MAX_VALUE), (int) (0.5 * Integer.MAX_VALUE), true},
                        {(int) (0.1 * Integer.MAX_VALUE), (int) (0.2 * Integer.MAX_VALUE), (int) (0.5 * Integer.MAX_VALUE), false}
                }
        );
    }

    @Test
    public void isItTriangle() {
        Triangle triangle = new Triangle(a, b, c);
        boolean actual = triangle.isItTriangle();
        assertThat(actual).isEqualTo(expected);
    }
}
