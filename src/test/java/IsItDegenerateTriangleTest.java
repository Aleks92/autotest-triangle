import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class IsItDegenerateTriangleTest {
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
                        {5, 2, 6, false},
                        {1, 1, 2, true},
                        {1, 2, 4, false},
                        {0, 0, 0, false},
                        {-2, -3, -4, false},
                        {-2, -2, -4, false},
                        {214748364, 429496728, 214748364, true},
                        {85126515, 15, 5613751, false}
                }
        );
    }

    @Test
    public void isItDegenerateTriangle() {
        Triangle triangle = new Triangle(a, b, c);
        boolean actual = triangle.isItDegenerateTriangle();
        assertThat(actual).isEqualTo(expected);
    }
}
